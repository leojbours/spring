package org.example.beans;

import jakarta.annotation.PostConstruct;
import org.example.interfaces.Speaker;
import org.example.interfaces.Tyre;
import org.example.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
  private String name;
  private final VehicleService service;

  @Autowired
  public Vehicle(VehicleService service) {
    this.service = service;
  }

  @PostConstruct
  private void initialize() {
    this.name = "montana 2004 1.8";
  }

  public void rotateTyre() {
    service.getTyre().rotate();
  }

  public void playMusic() {
    service.getSpeaker().playMusic();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setTyre(Tyre tyre) {
    service.setTyre(tyre);
  }

  public void setSpeaker(Speaker speaker) {
    service.setSpeaker(speaker);
  }
}
