package org.example.implementations;

import org.example.interfaces.Speaker;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeaker implements Speaker {

  @Override
  public void playMusic() {
    IO.println("playing music through Bose speakers");
  }
}
