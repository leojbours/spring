package org.example.main;

import java.util.ArrayList;
import java.util.List;
import org.example.beans.Person;
import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  static void main() {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var person = context.getBean(Person.class);
    Vehicle personVehicle = person.getVehicle();
    personVehicle.rotateTyre();
    personVehicle.playMusic();

    context.close();
  }
}