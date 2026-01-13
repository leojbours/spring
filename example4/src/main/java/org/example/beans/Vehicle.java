package org.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
  private String name;

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
  public void initialize() {
    this.name = "montana 2004 1.8";
  }

  @PreDestroy
  public void destroy() {
    IO.println("infelizmente o carro bateu :(");
  }
}
