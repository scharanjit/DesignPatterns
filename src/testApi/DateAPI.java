package testApi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

//import org.joda.time.DateTime;
//import org.joda.time.format.DateTimeFormat;
//import org.joda.time.format.DateTimeFormatter;
//import org.joda.time.format.ISODateTimeForm;



public class DateAPI {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
//        DateTimeFormatter joda = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
//        String dateText = "0000-02-04T14:07:55.121Z";
//        try {
//            Date dt_java = format.parse(dateText);
//            System.out.println("Java API:\t\t\t" + format.format(dt_java) + " (" + dt_java.getTime() + ")");
//            DateTime dt_2 = new DateTime(joda.parseDateTime(dateText));
//            System.out.println("Joda API:\t\t\t" + joda.print(dt_2) + " (" + dt_2.getMillis() + ")");
//            System.out.println("Joda formatting Java date:\t" + joda.print(dt_java.getTime()));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
    }
}
