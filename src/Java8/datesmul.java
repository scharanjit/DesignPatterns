package Java8;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class datesmul {
  private static final Logger logger = LoggerFactory.getLogger(datesmul.class);

  private static final DateTimeFormatter FORMATESA = new DateTimeFormatterBuilder()
      .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"))
      .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm"))
      .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
      .toFormatter();

  private static final DateTimeFormatter FORMATS = new DateTimeFormatterBuilder()
      .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"))
      .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
      .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
      .toFormatter();


  public static void main(String[] args) {

    datesmul datesmul = new datesmul();

    //    System.out.println(datesmul.getOrderDate("2020-01-27",FORMATESA ));
//    System.out.println(datesmul.getOrderDate("2019-03-07T11:08:00",FORMATESA ));
//    System.out.println(datesmul.getOrderDate("2020-01-27T17:28",FORMATESA ));
//    System.out.println(datesmul.getOrderDate("2020-01-27 11:08:00",FORMATESA ));
//    System.out.println(datesmul.getOrderDate("2020-01-27T11:08:00",FORMATESA ));

    System.out.println(datesmul.parseDate("2020-01-27 11:08:00"));
    System.out.println(datesmul.parseDate("2020-01-27T11:08:00"));
    System.out.println(datesmul.parseDate("2020-01-27"));

    System.out.println(datesmul.parseTime("2020-01-27 11:08:00"));
    System.out.println(datesmul.parseTime("2020-01-27T11:08:00"));
    System.out.println(datesmul.parseTime("2020-01-27"));
    System.out.println(datesmul.parseTime("2020-01-27sasadsadsa"));



    System.out.println(datesmul.parseDate("2020-02-27 11:08:00"));
    System.out.println(datesmul.parseDate("2020-02-27T11:08:00"));
    System.out.println(datesmul.parseDate("2020-02-27"));

    System.out.println(datesmul.parseTime("2020-02-27 11:08:00"));
    System.out.println(datesmul.parseTime("2020-02-27T11:08:00"));
    System.out.println(datesmul.parseTime("2020-02-27"));

  }

  private LocalDateTime getOrderDate(String orderDate, DateTimeFormatter orderDateFormats) {
    try {
      return LocalDateTime.parse(orderDate, orderDateFormats);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return null;
  }


  private java.sql.Date parseDate(String specimenCollectionDateTime) {
    if (specimenCollectionDateTime != null && !specimenCollectionDateTime.isEmpty()) {
      try {
        LocalDate formattedDate = LocalDate
            .parse(specimenCollectionDateTime, FORMATS);

        return validateDate(formattedDate);
      } catch (Exception e) {
          logger.error(specimenCollectionDateTime
                  + "could not be parsed with pattern [yyyy-MM-dd HH:mm:ss]. Reason:" + e.getMessage(),
              e);
      }
    }
    return null;
  }


  private java.sql.Time parseTime(String specimenCollectionDateTime) {
    if (specimenCollectionDateTime != null && !specimenCollectionDateTime.isEmpty()) {
      try {
        LocalDateTime formattedDateTime = LocalDateTime.parse(specimenCollectionDateTime, FORMATS);
        return validateTime(formattedDateTime);
      } catch (Exception e) {
      logger.error(specimenCollectionDateTime
          + "could not be parsed with pattern [yyyy-MM-dd HH:mm:ss]. Reason:" + e.getMessage(), e);
      }

    }
    return null;
  }

  private Date validateDate(LocalDate formattedDate) {
    if (formattedDate.isBefore(LocalDate.now())) {
      return java.sql.Date.valueOf(formattedDate);
    }
    return java.sql.Date.valueOf(LocalDate.now());
  }

  private Time validateTime(LocalDateTime formattedDateTime) {
    if (formattedDateTime.isBefore(LocalDateTime.now())) {
      return java.sql.Time.valueOf(formattedDateTime.toLocalTime());
    }
    return java.sql.Time.valueOf(LocalTime.now());
  }


}
