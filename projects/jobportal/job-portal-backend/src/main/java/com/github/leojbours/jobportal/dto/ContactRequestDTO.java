package com.github.leojbours.jobportal.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.github.leojbours.jobportal.entity.Contact}
 */
public record ContactRequestDTO(
    String email,
    String message,
    String name,
    String subject,
    String userType
) implements Serializable {}