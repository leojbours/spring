package com.github.leojbours.jobportal.service.impl;

import com.github.leojbours.jobportal.entity.Company;
import com.github.leojbours.jobportal.repository.CompanyRepository;
import com.github.leojbours.jobportal.service.CompanyService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

  CompanyRepository companyRepository;

  @Autowired
  public CompanyServiceImpl(CompanyRepository companyRepository) {
    this.companyRepository = companyRepository;
  }

  @Override
  public List<Company> findAll() {
    return companyRepository.findAll();
  }
}
