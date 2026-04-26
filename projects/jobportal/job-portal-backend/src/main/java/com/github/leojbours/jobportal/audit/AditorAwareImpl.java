package com.github.leojbours.jobportal.audit;

import java.util.Optional;
import org.jspecify.annotations.NullMarked;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

@Component("auditAwareImpl")
public class AditorAwareImpl implements AuditorAware<String> {

  @Override
  @NullMarked
  public Optional<String> getCurrentAuditor() {
    return Optional.of("System");
  }
}
