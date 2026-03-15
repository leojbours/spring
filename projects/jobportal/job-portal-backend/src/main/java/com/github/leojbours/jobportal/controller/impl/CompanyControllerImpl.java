package com.github.leojbours.jobportal.controller.impl;

import com.github.leojbours.jobportal.controller.CompanyController;
import com.github.leojbours.jobportal.dto.CompanyDto;
import com.github.leojbours.jobportal.entity.Company;
import com.github.leojbours.jobportal.service.CompanyService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/companies")
public class CompanyControllerImpl implements CompanyController {

  CompanyService companyService;

  @Autowired
  public CompanyControllerImpl(CompanyService companyService) {
    this.companyService = companyService;
  }

  @Override
  @GetMapping
  public ResponseEntity<List<CompanyDto>> findAll() {
    return ResponseEntity.ok(companyService.findAll());
  }
}
