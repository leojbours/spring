package org.example.main;

import org.example.beans.Person;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  static void main() {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var person = context.getBean(Person.class);
    System.out.println(person.getName());
    System.out.println(person.getVehicle().getName());
  }
}