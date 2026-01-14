package org.example.main;

import org.example.beans.Vehicle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  static void main() {
    var context = new ClassPathXmlApplicationContext("beans.xml");
    Vehicle xmlBean = context.getBean(Vehicle.class);
    IO.println(xmlBean.getName());
  }
}