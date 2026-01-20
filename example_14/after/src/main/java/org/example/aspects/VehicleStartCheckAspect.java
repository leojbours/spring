package org.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class VehicleStartCheckAspect {

  @Before("execution(* org.example.services.*.*(..)) && args(vehicleStarted,..)")
  public void checkPowerOn(JoinPoint joinPoint, boolean vehicleStarted) {
    if (!vehicleStarted) {
      throw new RuntimeException("Vehicle not started!");
    }
  }
}
