package turvo.countrycode;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CountryCodeResolver {
    private static ConcurrentHashMap<String, String> countryMap;

    static {
        countryMap = new ConcurrentHashMap();
        for (Locale l : Locale.getAvailableLocales()) {
            countryMap.put(l.getDisplayCountry(), l.getCountry() );
        }
        countryMap.put("America", "US");
        countryMap.put("Turvo", "TS");
    }

    public static void main(String[] args) {

        System.out.println("Country code for India is: " + " " + getCountry("India"));
        System.out.println("Country code for America is: " + " " + getCountry("America"));
        System.out.println("Country code for Turvo is:  " + " " + getCountry("Turvo"));

    }



    private static String getCountry(String countryName) {
        for (Map.Entry<String, String> entry : countryMap.entrySet())
            if (entry.getKey().equalsIgnoreCase(countryName)) {
                return entry.getValue();
            }
        return "";
    }


}
