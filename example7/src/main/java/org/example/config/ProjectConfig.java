package org.example.config;

import org.example.beans.Person;
import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

  @Bean()
  Vehicle vehicle() {
    Vehicle vehicle = new Vehicle();
    vehicle.setName("classic 1.0 sedan 2003");
    return vehicle;
  }

  @Bean
  Person person() {
    Person person = new Person();
    person.setName("leo");
    person.setVehicle(vehicle());
    return person;
  }
}
