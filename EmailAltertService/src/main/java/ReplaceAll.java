public class ReplaceAll {


    public static void main(String[] args) {
        String s = "+1@!.#%$^%^%#1312321(12321)";

        s = s.replaceAll("\\W", "");

//        String s1 = s.replaceAll("[^a-zA-Z0-9]+","");

        System.out.println(evaluatePhoneNumber(s));
        String s1 = "7878789+()0+1-2-3  -4-5-6-7-8@#@*&#(@-9-0";
        System.out.println(evaluatePhoneNumber("s123+45    6+789-0fe"));

    }


    public static String evaluatePhoneNumber(String number) {
        String result;
        if (number != null && !number.isEmpty()) {
            result = number.replaceAll("\\W", "").replaceAll("[^0-9]+", "");

            if (result.length() < 10 || result.length() > 11) {
                return number;
            } else if (result.length() == 10) {
                return result;
            } else {
                return result.substring(result.length() - 10, result.length());
            }
        }
        return "";
    }


}
