package intermediate.one.adapterpattern;

import java.util.Arrays;
import java.util.List;

public class AdaptorExample {

  public static void main(String[] args) {
    Integer[] arrayOfInts = new Integer[]{112,12,323,2};

    List<Integer> listOfInts = Arrays.asList(arrayOfInts);

    System.out.println(listOfInts);

    System.out.println(arrayOfInts);

  }

}
