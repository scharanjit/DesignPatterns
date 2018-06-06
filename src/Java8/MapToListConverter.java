package Java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToListConverter {

   static Map<Integer, String> countryDialCodeMap;


    public static void main(String[] args) {
        countryDialCodeMap = new HashMap<>();
        countryDialCodeMap.put(1, "United States");
        countryDialCodeMap.put(44, "United Kingdom");
        countryDialCodeMap.put(27, "South Africa");
        countryDialCodeMap.put(33, "France");
        countryDialCodeMap.put(55, "Brazil");

        System.out.println(convertGenericMapKeysToListWithStreamLambda(countryDialCodeMap));
        System.out.println(convertGenericMapValuesToListWithStreamMethodReference(countryDialCodeMap));

    }

    public static <K, V> List<K> convertGenericMapKeysToListWithStreamLambda(Map<K, V> map) {
        List<K> keyList = new ArrayList<>();
        map.entrySet().stream().forEach(entry -> keyList.add(entry.getKey()));
        return keyList;
    }


    public static <K, V> List<V> convertGenericMapValuesToListWithStreamMethodReference(Map<K, V> map) {
        List<V> keyList = new ArrayList<>();
        map.values().stream().forEach(keyList::add);
        return keyList;
    }
}

