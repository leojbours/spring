package com.github.leojbours.jobportal.exception;


import com.github.leojbours.jobportal.dto.ExceptionDTO;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.method.ParameterValidationResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.HandlerMethodValidationException;

@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<Map<String, String>> handleMethodArgumentNotValidException(
      MethodArgumentNotValidException exception
  ) {
    Map<String, String> errorsMap = new HashMap<>();
    exception.getBindingResult().getFieldErrors().forEach(
        error -> errorsMap.put(error.getField(), error.getDefaultMessage())
    );
    return ResponseEntity.badRequest().body(errorsMap);
  }

  @ExceptionHandler(HandlerMethodValidationException.class)
  public ResponseEntity<Map<String,String>> handleException(HandlerMethodValidationException exception) {
    Map<String, String> errors = new HashMap<>();
    List<ParameterValidationResult> results = exception.getParameterValidationResults();
    results.forEach(result -> {
      String paramName = result.getMethodParameter().getParameterName();

      // Combine all messages into a single comma-separated string
      String combinedMessages = result.getResolvableErrors()
          .stream()
          .map(MessageSourceResolvable::getDefaultMessage)  // extract each message
          .collect(Collectors.joining(", "));       // join messages
      errors.put(paramName, combinedMessages);
    });
    return ResponseEntity.badRequest().body(errors);
  }

  @ExceptionHandler(Exception.class)
  public ResponseEntity<ExceptionDTO> handleGlobalGenericException(
      Exception exception,
      WebRequest webRequest
  ) {
    ExceptionDTO exceptionDTO = new ExceptionDTO(
        webRequest.getDescription(false),
        HttpStatus.INTERNAL_SERVER_ERROR,
        exception.getMessage(),
        LocalDateTime.now()
    );

    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exceptionDTO);
  }
}
