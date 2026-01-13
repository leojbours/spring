package org.example.main;

import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  static void main() {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

    Vehicle vehicle1 = context.getBean("Classic", Vehicle.class);
    IO.println(vehicle1.getName());

    Vehicle vehicle2 = context.getBean("Vectra", Vehicle.class);
    IO.println(vehicle2.getName());

    Vehicle vehicle3 = context.getBean(Vehicle.class);
    IO.println(vehicle3.getName());
  }
}