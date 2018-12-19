package model;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Date;

public class NewDate {

    public static void main(String[] args) throws ParseException {
//        System.out.println(parseStringToDate("09-26-2018"));

        System.out.println(parseStringToDat("2018-04-02 22:15:36"));
        System.out.println(parseStringToTime("2018-04-02 22:15:36"));
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


    public static java.sql.Date parseStringToDat(String effectiveDate) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf1.setLenient(false);
        java.util.Date date = sdf1.parse(effectiveDate);
        java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
        return sqlStartDate;
    }

    public static Time parseStringToTime(String effectiveDate) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf1.setLenient(false);
        java.util.Date date = sdf1.parse(effectiveDate);
        java.sql.Time sqlStartDate = new java.sql.Time(date.getTime());
        return sqlStartDate;
    }


}
