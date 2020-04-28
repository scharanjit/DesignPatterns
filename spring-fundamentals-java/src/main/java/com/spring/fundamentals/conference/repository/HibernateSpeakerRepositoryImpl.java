package com.spring.fundamentals.conference.repository;

import com.spring.fundamentals.conference.models.Speaker;
import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

  @Override
  public List<Speaker> findAll() {
    List<Speaker> speakers = new ArrayList<>();

    Speaker speaker = new Speaker();
    speaker.setFirstName("Charanjit");
    speaker.setLastName("Singh");

    speakers.add(speaker);

    return speakers;
  }

}
