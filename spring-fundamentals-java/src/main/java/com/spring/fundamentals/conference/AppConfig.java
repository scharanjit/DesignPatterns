package com.spring.fundamentals.conference;

//import com.spring.fundamentals.conference.repository.CustomerRepository;
//import com.spring.fundamentals.conference.repository.HibernateCustomerRepositoryImpl;
import com.spring.fundamentals.conference.repository.HibernateSpeakerRepositoryImpl;
import com.spring.fundamentals.conference.repository.SpeakerRepository;
import com.spring.fundamentals.conference.service.SpeakerService;
import com.spring.fundamentals.conference.service.SpeakerServiceImpl;
import com.spring.fundamentals.conference.util.CalendarFactory;
import java.util.Calendar;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration   //applicationContext.xml is replaced by @Configuration Annotation. This is class level
@ComponentScan({"com.spring.fundamentals"})
public class AppConfig {


  @Bean(name = "cal")
  public CalendarFactory calendarFactory(){
    CalendarFactory calendarFactory = new CalendarFactory();
    calendarFactory.addDays(12);
    return calendarFactory;
  }

  @Bean
  public Calendar cal() throws Exception{

    return calendarFactory().getObject();
  }


    // Spring Beans defined by @Bean Configuration //method level

//  @Bean(name = "customerRepository")
//  public CustomerRepository getCustomerRepository() {
//    return new HibernateCustomerRepositoryImpl();
//  }

  //Setter Injection Simply calling a setter
  //All spring beans all singleton By default


//  @Bean(name = "speakerService")
//  @Scope(value = BeanDefinition.SCOPE_SINGLETON)
////  @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
//  public SpeakerService getSpeakerService(){
//    //without spring
////    return new SpeakerServiceImpl();
//
//    //with setter injection
////    SpeakerServiceImpl service = new SpeakerServiceImpl();
////    service.setRepository(getSpeakerRepository());
//
//    //constructor injection
////    SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
//
//    //autowire
//    SpeakerServiceImpl service = new SpeakerServiceImpl();
//
//    return service;
//  }
//
//
//  @Bean(name="speakerRepository")
//  public SpeakerRepository getSpeakerRepository(){
//    return new HibernateSpeakerRepositoryImpl();
//  }





}
