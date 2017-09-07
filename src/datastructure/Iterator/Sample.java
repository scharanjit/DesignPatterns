package datastructure.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Sample {

    public static void main(String args[]) {
        String removeElem = "Perl";
        List<String> myList = new ArrayList<String>();
        myList.add("Java");
        myList.add("Unix");
        myList.add("Oracle");
        myList.add("C++");
        myList.add("Perl");
        System.out.println("Before remove:");
        System.out.println(myList);
        Iterator<String> itr = myList.iterator();
        while(itr.hasNext()){
            if(removeElem.equals(itr.next())){
                itr.remove();
            }
        }
        System.out.println("After remove:");
        System.out.println(myList);
        Iterator<String> itr1 = myList.iterator();
        while(itr1.hasNext()){
//            if(removeElem.equals(itr.next())){
            itr1.next();  //try to comment and then uncomment this itr1.next()
                itr1.remove();
//            }
        }
        System.out.println(myList);
    }
}