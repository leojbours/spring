package com.github.leojbours.jobportal.controller;

import com.github.leojbours.jobportal.scope.ApplicationScopeBean;
import com.github.leojbours.jobportal.scope.RequestScopeBean;
import com.github.leojbours.jobportal.scope.SessionScopeBean;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scope")
@RequiredArgsConstructor
public class ScopeController {

  private final RequestScopeBean requestScopeBean;
  private final SessionScopeBean sessionScopeBean;
  private final ApplicationScopeBean applicationScopeBean;

  @GetMapping("setup")
  public ResponseEntity<Void> testRequestScope() {
    requestScopeBean.setName("Leo");
    sessionScopeBean.setName("Leo");
    return ResponseEntity.ok().build();
  }

  @GetMapping("request-setup-value")
  public ResponseEntity<String> testRequestWithSetUpValue() {
    return ResponseEntity.ok("Request scope value: " + requestScopeBean.getName());
  }

  @GetMapping("request-set-value")
  public ResponseEntity<String> testRequest() {
    requestScopeBean.setName("set in request");
    return ResponseEntity.ok("Request scope value: " + requestScopeBean.getName());
  }

  @GetMapping("session")
  public ResponseEntity<String> testSession() {
    return ResponseEntity.ok("Session scope value: " + sessionScopeBean.getName());
  }

  @GetMapping("application")
  public ResponseEntity<String> testApplication() {
    return ResponseEntity.ok("Application scope value: " + applicationScopeBean.getVisitorsCount());
  }

  @GetMapping("increase-visitors")
  public ResponseEntity<Integer> incrementApplicationVisitors() {
    applicationScopeBean.incrementVisitorsCount();
    return ResponseEntity.ok(applicationScopeBean.getVisitorsCount());
  }
}
