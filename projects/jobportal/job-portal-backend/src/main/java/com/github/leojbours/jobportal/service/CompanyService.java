package com.github.leojbours.jobportal.service;

import com.github.leojbours.jobportal.dto.CompanyDto;
import com.github.leojbours.jobportal.entity.Company;
import java.util.List;

public interface CompanyService {
  List<CompanyDto> findAll();
}
