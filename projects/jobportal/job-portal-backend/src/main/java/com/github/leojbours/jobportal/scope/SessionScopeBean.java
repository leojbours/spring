package com.github.leojbours.jobportal.scope;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
@Getter @Setter
public class SessionScopeBean {
  private String name;

  public SessionScopeBean() {
    System.out.println("SessionScopeBean created");
  }
}
