package com.github.leojbours.jobportal.repository;

import com.github.leojbours.jobportal.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {}