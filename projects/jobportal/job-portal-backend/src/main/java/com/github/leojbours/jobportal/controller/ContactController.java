package com.github.leojbours.jobportal.controller;

import com.github.leojbours.jobportal.dto.ContactRequestDTO;
import org.springframework.http.ResponseEntity;

public interface ContactController {
  ResponseEntity<String> saveContactMessage(ContactRequestDTO contactRequestDTO);
}
