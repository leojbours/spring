package com.github.leojbours.jobportal.service.impl;

import com.github.leojbours.jobportal.dto.CompanyDto;
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
  public List<CompanyDto> findAll() {
    return companyRepository.findAll().stream().map(this::toDto).toList();
  }

  private CompanyDto toDto(Company company) {
    return new CompanyDto(
        company.getId(),
        company.getName(),
        company.getLogo(),
        company.getIndustry(),
        company.getSize(),
        company.getRating(),
        company.getLocations(),
        company.getFounded(),
        company.getDescription(),
        company.getEmployees(),
        company.getWebsite(),
        company.getCreatedAt()
    );
  }
}
