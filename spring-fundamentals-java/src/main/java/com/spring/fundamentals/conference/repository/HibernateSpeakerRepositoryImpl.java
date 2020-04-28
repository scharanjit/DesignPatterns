package com.spring.fundamentals.conference.repository;

import com.spring.fundamentals.conference.models.Speaker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository("speakerRepository")
@Profile("dev")
//@Profile("prod")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

  /**
   * Example of Factory Bean
   */
  @Autowired
  private Calendar calendar;

  /**
   * Example of Spring experssion language :- read values at run time from configurations
   * @return
   */
  @Value("#{T(java.lang.Math).random()*100.0}")
  private double seedNum;

  @Override
  public List<Speaker> findAll() {
    List<Speaker> speakers = new ArrayList<>();

    Speaker speaker = new Speaker();
    speaker.setFirstName("Charanjit");
    speaker.setLastName("Singh");
    speaker.setSeedNum(seedNum);

    System.out.println(calendar.getTime());

    speakers.add(speaker);

    return speakers;
  }





}
