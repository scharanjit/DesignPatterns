package yolo;

import java.util.Random;

public class StringTest {

    public static void main(String[] args) {
//        String aa= "aa";
//        String bb ="";
//        String cc ="cc";
//
//
//        System.out.println(!aa.isEmpty()?aa);
//        String xxx=  !bb.isEmpty()?bb:"";
//        System.out.println();
//        System.out.println(!cc.isEmpty()?cc);


        System.out.println(_getDateTime("2016-07-08","12:13:45.333"));

    }

    public static String generateRandom() {
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder((100000 + rnd.nextInt(900000)) + "-");
        for (int i = 0; i < 5; i++)
            sb.append(chars[rnd.nextInt(chars.length)]);
        return sb.toString();
    }

    public static String _getDateTime(String date, String time){
        try {
            String parsedDate = date.replaceAll("-", "").replaceAll(":", "");
            String parsedTime = time.replaceAll(":","");

            return parsedDate.substring(0, 8) + parsedTime.substring(0,4);
        } catch (Exception e) {
            throw new RuntimeException("Could not parse the date: "+date+" & time: "+time+" "+ e.getMessage(), e);
        }
    }
}
