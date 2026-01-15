package org.example.main;

import org.example.beans.Person;
import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  static void main() {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var person = context.getBean(Person.class);
    IO.println(person.getName());
    IO.println(person.getVehicleName());

    context.close();
  }
}