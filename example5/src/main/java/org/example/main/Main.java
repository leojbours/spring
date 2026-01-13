package org.example.main;

import java.util.Random;
import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  static void main() {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

    Random random = new Random();

    int randomNumber = random.nextInt(10);

    if (randomNumber % 2 == 0) {
      context.registerBean("volkswagen", Vehicle.class, () -> {
        var vehicle = new Vehicle();
        vehicle.setName("Gol G5");
        return vehicle;
      });
    } else {
      context.registerBean("audi", Vehicle.class, () -> {
        var vehicle = new Vehicle();
        vehicle.setName("Audi R8");
        return vehicle;
      });
    }

    IO.println(randomNumber);

    Vehicle vehicle = context.getBean(Vehicle.class);
    IO.println(vehicle.getName());
    vehicle.drive();

    context.close();
  }
}