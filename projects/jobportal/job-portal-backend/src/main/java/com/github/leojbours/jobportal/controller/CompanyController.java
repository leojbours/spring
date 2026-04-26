package com.github.leojbours.jobportal.controller;

import com.github.leojbours.jobportal.dto.CompanyDto;
import com.github.leojbours.jobportal.service.CompanyService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/companies")
public class CompanyController {

  CompanyService companyService;

  @Autowired
  public CompanyController(CompanyService companyService) {
    this.companyService = companyService;
  }

  @GetMapping
  public ResponseEntity<List<CompanyDto>> findAll() {
    return ResponseEntity.ok(companyService.findAll());
  }
}
