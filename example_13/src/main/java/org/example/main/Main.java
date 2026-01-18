package org.example.main;

import org.example.config.ProjectConfig;
import org.example.services.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  static void main() {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var vehicleService1 = context.getBean(VehicleService.class);
    var vehicleService2 = context.getBean(VehicleService.class);

    System.out.println(vehicleService1.equals(vehicleService2));

    context.close();
  }
}