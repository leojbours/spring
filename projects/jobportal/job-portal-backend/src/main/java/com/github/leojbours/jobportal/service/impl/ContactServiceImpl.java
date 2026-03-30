package com.github.leojbours.jobportal.service.impl;

import com.github.leojbours.jobportal.dto.ContactRequestDTO;
import com.github.leojbours.jobportal.entity.Contact;
import com.github.leojbours.jobportal.repository.ContactRepository;
import com.github.leojbours.jobportal.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {

  private final ContactRepository contactRepository;

  @Autowired
  public ContactServiceImpl(ContactRepository contactRepository) {
    this.contactRepository = contactRepository;
  }

  @Override
  public boolean saveContact(ContactRequestDTO contactRequestDTO) {
    Contact contact = contactFromDto(contactRequestDTO);
    Contact savedContact = contactRepository.save(contact);

    return savedContact != null && savedContact.getId() != null;
  }


}
