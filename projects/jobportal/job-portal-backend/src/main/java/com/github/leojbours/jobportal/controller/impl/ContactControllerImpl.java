package com.github.leojbours.jobportal.controller.impl;

import com.github.leojbours.jobportal.controller.ContactController;
import com.github.leojbours.jobportal.dto.ContactRequestDTO;
import com.github.leojbours.jobportal.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contacts")
public class ContactControllerImpl implements ContactController {
  private final ContactService contactService;

  @Autowired
  public ContactControllerImpl(ContactService contactService) {
    this.contactService = contactService;
  }

  @Override
  @PostMapping()
  public ResponseEntity<String> saveContactMessage(@RequestBody ContactRequestDTO contactRequestDTO) {
    boolean saved = contactService.saveContact(contactRequestDTO);
    if (saved) {
      return ResponseEntity.status(HttpStatus.CREATED).body("Message sent successfully");
    } else {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to send message");
    }
  }
}
