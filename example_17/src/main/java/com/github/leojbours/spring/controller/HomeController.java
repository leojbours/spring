package com.github.leojbours.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

  @RequestMapping(value = {"","/","home"})
  public String getHomePage(Model model) {
    model.addAttribute("username", "Leonardo J.Bours");
    return "home.html";
  }
}