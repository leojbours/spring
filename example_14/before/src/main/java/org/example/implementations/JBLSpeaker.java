package org.example.implementations;

import org.example.interfaces.Speaker;
import org.example.model.Song;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JBLSpeaker implements Speaker {

  @Override
  public String playMusic(Song song){
    return "Playing the song "+ song.getTitle()+ " by "
        + song.getSingerName()+
        " with JBL speakers";
  }
}
