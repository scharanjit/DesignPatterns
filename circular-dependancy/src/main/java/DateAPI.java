import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateAPI {

    public static void main(String[] args) throws ParseException {
//        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        //2015-10-08T11:50:59
        //2015-11-21 15:41:43.000

        DateTimeFormatter joda = DateTimeFormat.forPattern("yyyy-mm-dd");
        String dateText = "2018-06-07 11:11:23.000";
        try {
            Date dt_java = format.parse(dateText);
            System.out.println("Java API:\t\t\t" + format.format(dt_java));



            System.out.println("Joda formatting Java date:\t" + joda.print(dt_java.getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

// check this https://stackoverflow.com/questions/30072671/convert-given-date-to-generic-date-format
