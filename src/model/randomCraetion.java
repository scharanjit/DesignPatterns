package model;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;


public class randomCraetion {

    public static void main(String[] args) throws NumberParseException {
//        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
//        Random rnd = new Random();
//        StringBuilder sb = new StringBuilder((100000 + rnd.nextInt(900000)) + "-");
//        for (int i = 0; i < 5; i++)
//            sb.append(chars[rnd.nextInt(chars.length)]);
//
//        System.out.println( sb.toString());

//
//        List<String> l = new ArrayList();
//        l.add("Av");
//        l.add("cs");
//
//
//
//        System.out.println(l.stream().collect(Collectors.joining("-")));

//        String number = "(+063) 211-111-1111";
//        System.out.println(number);
//       String nxx= number.replaceAll("[^0-9]", "");
//        System.out.println(nxx);
//        String viw = "+" + nxx.replaceFirst("^0*(.*)","$1");
//        System.out.println(viw);

//        System.out.println("+" + nxx.replaceFirst("^0*(.*)","$1"));

//        System.out.println(  );
//        System.out.println(number = "+" + number.replaceFirst("^0*(.*)","$1"));


//        PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
//
//        Phonenumber.PhoneNumber numberProto = phoneUtil.parse(number, "");
//        String localNumber = String.valueOf(numberProto.getNationalNumber());
//        System.out.println(localNumber);
//        String countryCode = "+" + String.valueOf(numberProto.getCountryCode());
//        System.out.println(countryCode);


//        System.getProperty("line.separator");

        String dob ="1990-12-12 12:03:232.3232";

            String parsedDOB = dob.replaceAll("-","").replaceAll(":","");
//        System.out.println( parsedDOB.substring(0,8));

        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(Calendar.getInstance().getTime());
        System.out.println(timeStamp);



    }
}
