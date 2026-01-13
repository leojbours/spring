package org.example.config;

import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

  @Bean
  Vehicle vehicle1() {
    Vehicle vehicle = new Vehicle();
    vehicle.setName("classic 1.0 sedan 2003");
    return vehicle;
  }

  @Bean
  Vehicle vehicle2() {
    Vehicle vehicle = new Vehicle();
    vehicle.setName("vectra 2.0 sedan 2006");
    return vehicle;
  }
}
