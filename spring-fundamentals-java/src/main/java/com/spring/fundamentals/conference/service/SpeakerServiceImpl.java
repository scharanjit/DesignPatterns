package com.spring.fundamentals.conference.service;

import com.spring.fundamentals.conference.models.Speaker;
import com.spring.fundamentals.conference.repository.HibernateSpeakerRepositoryImpl;
import com.spring.fundamentals.conference.repository.SpeakerRepository;
import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

  //without spring
//  private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
  private SpeakerRepository repository;

  //Setter Injection
  public void setRepository(SpeakerRepository repository){
    this.repository = repository;
  }


  //Construction Injection
  public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
    this.repository = speakerRepository;
  }

  @Override
  public List<Speaker> findAll(){
    return repository.findAll();

  }

}
