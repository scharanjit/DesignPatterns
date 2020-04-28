package com.spring.fundamentals.conference;

//import com.spring.fundamentals.conference.repository.CustomerRepository;
//import com.spring.fundamentals.conference.repository.HibernateCustomerRepositoryImpl;
import com.spring.fundamentals.conference.repository.HibernateSpeakerRepositoryImpl;
import com.spring.fundamentals.conference.repository.SpeakerRepository;
import com.spring.fundamentals.conference.service.SpeakerService;
import com.spring.fundamentals.conference.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration   //applicationContext.xml is replaced by @Configuration Annotation. This is class level
public class AppConfig {

    // Spring Beans defined by @Bean Configuration //method level

//  @Bean(name = "customerRepository")
//  public CustomerRepository getCustomerRepository() {
//    return new HibernateCustomerRepositoryImpl();
//  }

  //Setter Injection Simply calling a setter
  //All spring beans all singleton By default


  @Bean(name = "speakerService")
  public SpeakerService getSpeakerService(){
    //without spring
//    return new SpeakerServiceImpl();

    //with setter injection
//    SpeakerServiceImpl service = new SpeakerServiceImpl();
//    service.setRepository(getSpeakerRepository());

    //constructor injection
    SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());

    return service;
  }


  @Bean(name="speakerRepository")
  public SpeakerRepository getSpeakerRepository(){
    return new HibernateSpeakerRepositoryImpl();
  }


}
