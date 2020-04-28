package com.spring.fundamentals.conference.service;

import com.spring.fundamentals.conference.models.Speaker;
import com.spring.fundamentals.conference.repository.HibernateSpeakerRepositoryImpl;
import com.spring.fundamentals.conference.repository.SpeakerRepository;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.xml.ws.ServiceMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

  //without spring
//  private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();



  private SpeakerRepository repository;

  //Setter Injection
//  @Autowired
  public void setRepository(SpeakerRepository repository){
    System.out.println("SpeakerServiceImpl setter");
    this.repository = repository;
  }


  //Construction Injection
  @Autowired
  public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
    System.out.println("SpeakerServiceImpl repository args constructor");
    this.repository = speakerRepository;
  }

  //Autowiring
  public SpeakerServiceImpl(){
    System.out.println("SpeakerServiceImpl no args constructor");
  }


  @PostConstruct //bean aware annotations
  private void intialize(){
    System.out.println("we are called after constructors");
  }

  @Override
  public List<Speaker> findAll(){
    return repository.findAll();

  }

}
