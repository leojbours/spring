package com.github.leojbours.jobportal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;
import lombok.Data;

@Entity
@Table(name = "companies")
@Data
public class Company {

  @Id()
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "name", nullable = false, unique = true)
  private String name;

  @Column(name = "logo", length = 500)
  private String logo;

  @Column(name = "industry", nullable = false, length = 100)
  private String industry;

  @Column(name = "size", nullable = false, length = 50)
  private String size;

  @Column(name = "rating", nullable = false, precision = 3, scale = 2)
  private BigDecimal rating;

  @Column(name = "locations", length = 1000)
  private String locations;

  @Column(name = "founded", nullable = false)
  private Integer founded;

  @Lob
  @Column(name = "description")
  private String description;

  @Column(name = "employees")
  private Integer employees;

  @Column(name = "website", length = 500)
  private String website;

  @Column(name = "created_at", nullable = false)
  private Instant createdAt;

  @Column(name = "created_by", nullable = false, length = 20)
  private String createdBy;

  @Column(name = "updated_at")
  private Instant updatedAt;

  @Column(name = "updated_by", length = 20)
  private String updatedBy;
}
