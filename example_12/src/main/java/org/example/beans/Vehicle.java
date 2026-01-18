package org.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
  private String name;

  public Vehicle() {
    IO.println("creating vehicle");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void drive() {
    IO.println("vrum, vrum!");
  }

  @PostConstruct
  private void initialize() {
    this.name = "montana 2004 1.8";
  }
}
