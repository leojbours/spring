package org.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
  private String name;
  private Vehicle vehicle;

  @Autowired
  public Person(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

//  @Autowired
  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  @PostConstruct
  private void initialize() {
    this.name = "leo";
  }
}
