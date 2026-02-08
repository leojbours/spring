package com.github.leojbours.spring.service;

import com.github.leojbours.spring.model.Contact;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

  public boolean saveMessage(Contact contact) {
    boolean saved = true;

    IO.println(contact.toString());

    return saved;
  }
}
