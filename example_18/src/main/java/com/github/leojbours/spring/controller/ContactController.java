package com.github.leojbours.spring.controller;

import com.github.leojbours.spring.model.Contact;
import com.github.leojbours.spring.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller()
public class ContactController {

  ContactService contactService;

  public ContactController(ContactService contactService) {
    this.contactService = contactService;
  }

  @RequestMapping("/contact")
  public String getContactPage() {
    return "contact.html";
  }

  @PostMapping("/saveMsg")
  public ModelAndView saveMessage(Contact contact) {
    contactService.saveMessage(contact);

    return new ModelAndView("redirect:/contact");
  }

//  @PostMapping("/saveMsg")
//  public ModelAndView saveMessage(
//      @RequestParam String name,
//      @RequestParam String mobileNum,
//      @RequestParam String email,
//      @RequestParam String subject,
//      @RequestParam String message
//  ) {
//    IO.println("Name: " + name);
//    IO.println("Mobile: " + mobileNum);
//    IO.println("Email: " + email);
//    IO.println("Subject: " + subject);
//    IO.println("Message: " + message);
//
//    return new ModelAndView("redirect:/contact");
//  }
}
