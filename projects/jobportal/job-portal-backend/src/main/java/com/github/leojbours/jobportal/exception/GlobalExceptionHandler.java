package com.github.leojbours.jobportal.exception;


import com.github.leojbours.jobportal.dto.ExceptionDTO;
import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

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
