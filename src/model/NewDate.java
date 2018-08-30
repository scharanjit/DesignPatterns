package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NewDate {

    public static void main(String[] args) {
        System.out.println(parseStringToDate("09-26-2018"));

    }

    public static Date parseStringToDate(String stringDate){
        try {
            SimpleDateFormat incomingFormat = new SimpleDateFormat("MM-dd-yyyy");
            SimpleDateFormat requiredFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date date = incomingFormat.parse(stringDate);
            Date date1 = requiredFormat.parse(requiredFormat.format(date));
            return date1;
        }catch (Exception e){
            throw new  RuntimeException("Unable to parse the date"+stringDate+" "+e.getMessage(),e);
        }

    }
}
