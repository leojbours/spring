package org.example.aspects;

import java.time.Duration;
import java.time.Instant;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class LoggerAspect {

  private Logger logger = Logger.getLogger(LoggerAspect.class.getName());

  @Around("execution(* org.example.services.*.*(..)) && !execution(* org.example.services.VehicleServices.playMusic(..))")
  public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
    Instant methodExecutionStart = Instant.now();
    logger.info("Logging from execution() method");
    return log(joinPoint, methodExecutionStart);
  }

  @Around("@annotation(org.example.annotations.LogAspect)")
  public Object logWithAnnotation(ProceedingJoinPoint joinPoint) throws Throwable {
    Instant methodExecutionStart = Instant.now();
    logger.info("Logging from @annotation() method");
    return log(joinPoint, methodExecutionStart);
  }

  private Object log(ProceedingJoinPoint joinPoint, Instant methodExecutionStart) throws Throwable {
    logger.info(joinPoint.getSignature().toString() + " method execution start");
    Object proceed = joinPoint.proceed();
    logger.info(joinPoint.getSignature().toString() + " method execution end");
    Instant methodExecutionFinish = Instant.now();
    long elapsedTime = Duration.between(methodExecutionStart, methodExecutionFinish).toMillis();
    logger.info(joinPoint.getSignature().toString() + " method execution elapsed time: " + elapsedTime);
    return proceed;
  }

  @AfterThrowing(value = "execution(* org.example.services.*.*(..))", throwing = "ex")
  public void logException(JoinPoint joinPoint, Exception ex) {
    logger.log(Level.SEVERE, joinPoint.getSignature().toString() +
        " has failed to execute due to: " + ex.getMessage());
  }

  @AfterReturning(value = "execution(* org.example.services.*.*(..))", returning = "val")
  public void logStatus(JoinPoint joinPoint, Object val) {
    logger.info(joinPoint.getSignature() + " Method successfully finished with return of: " + val.toString());
  }
}
