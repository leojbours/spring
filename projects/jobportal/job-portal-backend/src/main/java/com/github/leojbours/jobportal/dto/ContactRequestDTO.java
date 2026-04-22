package com.github.leojbours.jobportal.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.io.Serializable;

/**
 * DTO for {@link com.github.leojbours.jobportal.entity.Contact}
 */
public record ContactRequestDTO(
    @NotBlank(message = "email must not be empty!")
    @Email(message = "invalid email address!")
    String email,
    @NotBlank(message = "message must not be empty!")
    String message,
    @NotBlank(message = "name must not be empty!")
    @Size(min = 2, max = 255, message = "name must be between 2 and 255 characters!")
    String name,
    @NotBlank(message = "subject must not be empty!")
    String subject,
    @NotBlank(message = "userType must not be empty!")
    @Pattern(regexp = "Job Seeker|Employer|Other", message = "userType must be either Job Seeker, Employer or Other!")
    String userType
) implements Serializable {}