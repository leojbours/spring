package com.github.leojbours.jobportal.service;

import com.github.leojbours.jobportal.dto.ContactRequestDTO;
import com.github.leojbours.jobportal.entity.Contact;
import org.springframework.beans.BeanUtils;

public interface ContactService {
  boolean saveContact(ContactRequestDTO contactRequestDTO);
  default Contact contactFromDto(ContactRequestDTO contactRequestDTO) {
    Contact contact = new Contact();
    BeanUtils.copyProperties(contactRequestDTO, contact);
    return contact;
  }
}
