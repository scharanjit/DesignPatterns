package datastructure.mapExample;

import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        treeMap.put(1,2);
        treeMap.put(1,2);
        treeMap.put(1,2);
        treeMap.put(1,2);
        treeMap.put(1,2);
        treeMap.put(1,2);
        System.out.println(treeMap.size());
    }
}
