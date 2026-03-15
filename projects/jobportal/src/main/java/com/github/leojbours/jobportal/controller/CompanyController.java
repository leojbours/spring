package com.github.leojbours.jobportal.controller;

import com.github.leojbours.jobportal.dto.CompanyDto;
import com.github.leojbours.jobportal.entity.Company;
import java.util.List;
import org.springframework.http.ResponseEntity;

public interface CompanyController {
  ResponseEntity<List<CompanyDto>> findAll();
}
