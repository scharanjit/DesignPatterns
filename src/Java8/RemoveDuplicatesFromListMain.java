package Java8;


import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromListMain {

    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1, 2, 3, 3, 2, 1, 434, 545, 54};

        // Remove duplicates
        List<Integer> listWithDuplicateIntegers = Arrays.asList(arr);


        Set<Integer> setWithoutDuplicates = listWithDuplicateIntegers.stream().collect(Collectors.toSet());
        setWithoutDuplicates.forEach((i) -> System.out.println(" " + i));


        // Given a list of numbers, square them and filter the numbers which are greater 10000 and then find average of them.


        List<Integer> arrLst = Arrays.asList(arr);

        OptionalDouble average = arrLst.stream().mapToInt(n -> n * n).filter(n -> n > 1000).average();

        if (average.isPresent())
            System.out.println(average.getAsDouble());
    }
}
