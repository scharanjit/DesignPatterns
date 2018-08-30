package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List a = new ArrayList();
        a.add(1);
        a.add(2);

        List a1=null;
        System.out.println();

        List B = a1 != null ?a:Collections.EMPTY_LIST;
        System.out.println(B);
    }
}
