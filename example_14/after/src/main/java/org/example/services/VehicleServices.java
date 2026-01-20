package org.example.services;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.example.annotations.LogAspect;
import org.example.interfaces.Speaker;
import org.example.interfaces.Tyre;
import org.example.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {
  @Autowired
  private Speaker speakers;
  private Tyre tyres;

  @LogAspect
  public String playMusic(boolean vehicleStarted, Song song){
    return speakers.playMusic(song);
  }

  public String moveVehicle(boolean vehicleStarted){
    return tyres.rotate();
  }

  public String applyBrake(boolean vehicleStarted){
    return tyres.stop();
  }

  public Speaker getSpeakers() {
    return speakers;
  }

  public void setSpeakers(Speaker speakers) {
    this.speakers = speakers;
  }

  public Tyre getTyres() {
    return tyres;
  }

  @Autowired
  public void setTyres(Tyre tyres) {
    this.tyres = tyres;
  }
}