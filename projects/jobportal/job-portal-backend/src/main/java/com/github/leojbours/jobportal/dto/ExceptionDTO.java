package com.github.leojbours.jobportal.dto;

import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;

public record ExceptionDTO(String apiPath, HttpStatus code, String errorMessage,  LocalDateTime timestamp) {}
