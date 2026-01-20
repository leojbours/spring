package org.example.main;

import org.example.config.ProjectConfig;
import org.example.model.Song;
import org.example.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  static void main() {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    var vehicleServices = context.getBean(VehicleServices.class);
    System.out.println(vehicleServices.getClass());
    Song song = new Song();
    song.setTitle("The Emptiness Machine");
    song.setSingerName("Linkin Park");
    boolean vehicleStarted = true;
    String moveVehicleStatus = vehicleServices.moveVehicle(vehicleStarted);
    String playMusicStatus = vehicleServices.playMusic(vehicleStarted,song);
    String applyBrakeStatus = vehicleServices.applyBrake(vehicleStarted);
  }
}