package datastructure.xxSolution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class Prsav {


    ArrayList<Integer> arrayList;
    HashMap<Integer, Integer> hash;

    public Prsav() {
        arrayList = new ArrayList<>();
        hash = new HashMap<>();
    }


    public void add(int x) {

        if (hash.get(x) != null) {
            return;
        }


        arrayList.add(x);
        int size = arrayList.size();
        hash.put(x, size);

    }


    public void remove(int x) {

        Integer index = hash.get(x);
        if (index == null) {
            return;
        }

        hash.remove(x);
        int size = arrayList.size();
        int last = arrayList.get(size - 1);

        Collections.swap(arrayList, index, size - 1);
        arrayList.remove(size - 1);

        hash.put(last, index);


    }


    public int getRandom() {

        Random random = new Random();

        int index = random.nextInt(arrayList.size());

        return arrayList.get(index);
    }


    Integer search(int x) {
        return hash.get(x);
    }


    public static void main(String[] args) {
        Prsav prsav = new Prsav();

        prsav.add(8);
        prsav.add(9);
        prsav.add(10);
        prsav.add(11);
        System.out.println(prsav.search(11));
        System.out.println(" " + prsav.search(3));
        prsav.remove(8);
        prsav.remove(9);
        System.out.println(prsav.search(8));
        System.out.println(prsav.search(9));
        System.out.println(prsav.getRandom());
        System.out.println(prsav.getRandom());
    }
}
