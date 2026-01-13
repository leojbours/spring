package org.example.main;

import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  static void main() {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

    Vehicle vehicle = context.getBean(Vehicle.class);
    IO.println(vehicle.getName());
    vehicle.drive();

    context.close();
  }
}