package org.example.implementations;

import org.example.interfaces.Speaker;
import org.example.model.Song;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeaker implements Speaker {

  @Override
  public String playMusic(Song song){
    return "Playing the song "+ song.getTitle()+ " by "
        + song.getSingerName()+
        " with Bose speakers";
  }
}
