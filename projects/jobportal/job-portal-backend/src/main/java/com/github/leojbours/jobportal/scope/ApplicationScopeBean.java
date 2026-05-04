package com.github.leojbours.jobportal.scope;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope
@Getter @Setter
public class ApplicationScopeBean {
  private int visitorsCount = 0;

  public ApplicationScopeBean() {
    System.out.println("ApplicationScopeBean created");
  }

  public void incrementVisitorsCount() {
    visitorsCount++;
  }
}
