package com.spring.fundamentals.conference;

import com.spring.fundamentals.conference.service.SpeakerService;
import com.spring.fundamentals.conference.service.SpeakerServiceImpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

  public static void main(String[] args) {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");


//    SpeakerService service = new SpeakerServiceImpl();

    SpeakerService service = applicationContext.getBean("speakerService",SpeakerService.class);
    System.out.println(service.findAll().get(0).getFirstName());
  }

}
