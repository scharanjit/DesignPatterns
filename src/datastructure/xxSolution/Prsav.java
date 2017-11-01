package datastructure.xxSolution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class Prsav {

    ArrayList<Integer> arrayList;
    HashMap<Integer,Integer> hashMap;

    public Prsav(){
        arrayList = new ArrayList();
        hashMap = new HashMap();
    }

    public void add(int x){
        if(hashMap.get(x) == null)
            return;

        arrayList.add(x);
        int size = arrayList.size();

        hashMap.put(x,size);

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

    private void remove(int i) {
       Integer index = hashMap.get(i);
        if(index==null)
            return;
        hashMap.remove(i);

        int size =arrayList.size();

        Integer last =arrayList.get(size-1);

        Collections.swap(arrayList,index,size-1);

        hashMap.put(last,index);





    }

    private int getRandom() {

        Random random = new Random();
        int index =  random.nextInt(arrayList.size());
        return (int)arrayList.get(index);
    }

    private boolean search(int i) {

     if(hashMap.get(i) != null)
         return true;

     return false;


    }
}
