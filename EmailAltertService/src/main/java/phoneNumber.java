import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;


public class phoneNumber {

//    public static String parseContact(String contactNumber) throws NumberParseException {
//        String countryCode = null;
//        String result = null;
//        int beginIndex = contactNumber.indexOf("(");
//        if (beginIndex < 0) {
//            beginIndex = contactNumber.indexOf("+");
//        } else {
//            beginIndex++;
//        }
//        if (beginIndex < 0) {
//            result = contactNumber.replaceAll("[^0-9]", "").length() > 10 ?
//                    contactNumber.substring(contactNumber.length() - 10) : contactNumber;
//        } else {
//            PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
//            contactNumber = "+" + contactNumber.replaceAll("[^0-9]", "");
//            Phonenumber.PhoneNumber numberProto = phoneUtil.parse(contactNumber, "");
//            result = String.valueOf(numberProto.getNationalNumber());
//            countryCode = "+" + String.valueOf(numberProto.getCountryCode());
//        }
//        System.out.printf("localNumber  %s\n", result);
//        System.out.printf("countryCode  %s\n", countryCode);
//        return null;// countryCode + result.toString();
//    }


    public static String parseContact(String contactNumber) throws NumberParseException {
        System.out.println("");
        System.out.println("Input Phone Number : "+contactNumber);
        String countryCode = null;
        String result = null;
        int beginIndex = contactNumber.indexOf("(");
        if (beginIndex < 0) {
            beginIndex = contactNumber.indexOf("+");
        } else {
            beginIndex++;
        }
        if (beginIndex < 0) {
            result = contactNumber.replaceAll("[^0-9]", "").length() > 10 ?
                    contactNumber.substring(contactNumber.length() - 10) : contactNumber;
        } else {
            PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
            contactNumber = "+" + contactNumber.replaceAll("[^0-9]", "");
            Phonenumber.PhoneNumber numberProto = phoneUtil.parse(contactNumber, "");
            result = String.valueOf(numberProto.getNationalNumber());
            countryCode = "+" + String.valueOf(numberProto.getCountryCode());
        }
        System.out.printf("localNumber  %s\n", result);
        System.out.printf("countryCode  %s\n", countryCode);
        return result;
    }


    public static void main(String[] args) throws NumberParseException {
//        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
//        Random rnd = new Random();
//        StringBuilder sb = new StringBuilder((100000 + rnd.nextInt(900000)) + "-");
//        for (int i = 0; i < 5; i++)
//            sb.append(chars[rnd.nextInt(chars.length)]);
//
//        System.out.println( sb.toString());
//
//
//        List<String> l = new ArrayList();
//        l.add("Av");
//        l.add("cs");
//
//
//
//        System.out.println(l.stream().collect(Collectors.joining("-")));

        String number = "(+063) 211-111-1111";
        String number1 = "123-123-1234";
        String number2 = "9618606047";
        String number3 = "+91 9618606047";
        String number4 = "+919618606047";
        String number5 = "0019618606047";
        String number6 = "+0019618606047";
        String number7 = "(123)123-1232";

        parseContact(number);
        parseContact(number1);
        parseContact(number2);
        parseContact(number3);
        parseContact(number4);
        parseContact(number5);
        parseContact(number6);
        parseContact(number7);

//        System.out.println(number);
//        String nxx = number.replaceAll("[^0-9]", "");
//        System.out.println(nxx);
//        String viw = "+" + nxx.replaceFirst("^0*(.*)", "$1");
//        System.out.println(viw);
//
//        System.out.println("+" + nxx.replaceFirst("^0*(.*)", "$1"));
//
//        System.out.println();
//        System.out.println(number = "+" + number.replaceFirst("^0*(.*)", "$1"));
//        System.out.println("number==>"+number);
//
//        PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
//
//        String number1 = number.replaceAll("\\(","").replaceAll("\\)","");
//        Phonenumber.PhoneNumber numberProto = phoneUtil.parse(number1, "");
//        String localNumber = String.valueOf(numberProto.getNationalNumber());
//        System.out.println(localNumber);
//        String countryCode = "+" + String.valueOf(numberProto.getCountryCode());
//        System.out.println(countryCode);


//        System.getProperty("line.separator");

//        String dob ="1990-12-12 12:03:232.3232";
//
//            String parsedDOB = dob.replaceAll("-","").replaceAll(":","");
////        System.out.println( parsedDOB.substring(0,8));
//
//        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(Calendar.getInstance().getTime());
//        System.out.println(timeStamp);


    }
}
