package org.example.main;

import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

    Vehicle vehicle1 = context.getBean("vehicle1", Vehicle.class);
    System.out.println(vehicle1.getName());

    Vehicle vehicle2 = context.getBean("vehicle2", Vehicle.class);
    System.out.println(vehicle2.getName());
  }
}