package com.github.leojbours.jobportal.controller;

import com.github.leojbours.jobportal.dto.ContactRequestDTO;
import com.github.leojbours.jobportal.service.ContactService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contacts")
public class ContactController {
  private final ContactService contactService;

  @Autowired
  public ContactController(ContactService contactService) {
    this.contactService = contactService;
  }

  @PostMapping()
  public ResponseEntity<String> saveContactMessage(@RequestBody @Valid ContactRequestDTO contactRequestDTO) {
    boolean saved = contactService.saveContact(contactRequestDTO);
    if (saved) {
      return ResponseEntity.status(HttpStatus.CREATED).body("Message sent successfully");
    } else {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to send message");
    }
  }

  @GetMapping
  public ResponseEntity<String> fetchOpenContacts(
      @RequestParam
      @NotBlank(message = "Status is required")
      String status
  ) {
    return ResponseEntity.ok("This are the contacts with status: " + status);
  }
}
