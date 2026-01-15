package org.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
  private String name;

  @Autowired
  private Vehicle vehicle;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public String getVehicleName() {
    return vehicle.getName();
  }

  @PostConstruct
  private void initialize() {
    this.name = "leo";
  }
}
