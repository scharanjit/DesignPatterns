package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTest {
    public static void main(String[] args) {

        System.out.println(_shiftTimeZone("2018-06-08T18:30:19", "yyyy-MM-dd'T'HH:mm:ss", TimeZone.getTimeZone("UTC"), TimeZone.getTimeZone("IST")));

    }

    public static String _shiftTimeZone(String date, String dateTimeFormat, TimeZone sourceTimeZone, TimeZone targetTimeZone) {
        try {
            Calendar sourceCalendar = Calendar.getInstance();
            DateFormat dateFormat = new SimpleDateFormat(dateTimeFormat);
            Date formattedDate = dateFormat.parse(date);

            sourceCalendar.setTime(formattedDate);
            sourceCalendar.setTimeZone(sourceTimeZone);

            Calendar targetCalendar = Calendar.getInstance();
            for (int field : new int[]{Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH, Calendar.HOUR, Calendar.MINUTE, Calendar.SECOND, Calendar.MILLISECOND}) {
                targetCalendar.set(field, sourceCalendar.get(field));
            }
            targetCalendar.setTimeZone(targetTimeZone);

            DateFormat dateFormat1 = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");

            Calendar cal = Calendar.getInstance();
            cal.setTime(dateFormat1.parse(targetCalendar.getTime().toString()));
            String year = String.valueOf(cal.get(Calendar.YEAR));
            String month = (cal.get(Calendar.MONTH) + 1) < 10 ? String.valueOf("0" + (cal.get(Calendar.MONTH) + 1)) : String.valueOf(cal.get(Calendar.MONTH) + 1);

            String dte = cal.get(Calendar.DATE) < 10 ? String.valueOf("0" + cal.get(Calendar.DATE)) : String.valueOf(cal.get(Calendar.DATE));


            String hr = cal.get(Calendar.HOUR) < 10 ? String.valueOf("0" + cal.get(Calendar.HOUR)) : String.valueOf(cal.get(Calendar.HOUR));

            String minute = cal.get(Calendar.MINUTE) < 10 ? String.valueOf("0" + cal.get(Calendar.MINUTE)) : String.valueOf(cal.get(Calendar.MINUTE));
            return year + month + dte + hr + minute;
        } catch (Exception e) {
            throw new RuntimeException("Could not parse date: " + date + " " + e.getMessage(), e);
        }
    }
}
