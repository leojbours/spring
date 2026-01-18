package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.beans", "org.example.implementations", "org.example.services"})
public class ProjectConfig {
}
