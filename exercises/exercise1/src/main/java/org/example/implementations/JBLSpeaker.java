package org.example.implementations;

import org.example.interfaces.Speaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JBLSpeaker implements Speaker {

  @Override
  public void playMusic() {
    IO.println("playing music through JBL speakers");
  }
}
