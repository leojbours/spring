package org.example.config;

import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example.beans")
public class ProjectConfig {

  @Bean
  Vehicle vehicle1() {
    var vehicle = new Vehicle();
    vehicle.setName("Classic 2003 1.0");
    return vehicle;
  }

  @Bean
  Vehicle vehicle2() {
    var vehicle = new Vehicle();
    vehicle.setName("Montana 2004 1.8");
    return vehicle;
  }

  @Bean
  @Primary
  Vehicle vehicle3() {
    var vehicle = new Vehicle();
    vehicle.setName("Vectra 2006 2.0");
    return vehicle;
  }
}
