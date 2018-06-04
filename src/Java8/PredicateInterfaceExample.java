package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


/*
*
* Java 8 predicates are functional interface introduced in java 8.
Predicate is single argument function which returns true or false.
 It has test method which returns true or false.
* */
public class PredicateInterfaceExample {


    public static void main(String[] args) {
        Predicate predicate = i -> (int) i > 100;
        boolean greatCheck = predicate.test(200);
        System.out.println(greatCheck);

        // Predicate as function argument
        boolean boolCheck = boolFnctCheck(300, p -> (int) p > 200);
        System.out.println(boolCheck);


        //Predicate: Filter list using predicate

        List studentList = createStudentList();

        // Filter all male student who have age > 18
        Predicate<Student> predicate1 = s -> s.getGender().equalsIgnoreCase("M") && s.getAge() > 18;

        List<Student> studList = filterStudents(studentList, predicate1);

        System.out.println("Male students having age > 18 are :" + studList);


    }


    public static List filterStudents(List studentList, Predicate predicate) {
        return (List) studentList.stream().filter(predicate).collect(Collectors.toList());

    }


    public static List createStudentList() {
        List studentList = new ArrayList();
        Student s1 = new Student(1, "Arpit", "M", 19);
        Student s2 = new Student(2, "John", "M", 17);
        Student s3 = new Student(3, "Mary", "F", 14);
        Student s4 = new Student(4, "Martin", "M", 21);
        Student s5 = new Student(5, "Monica", "F", 16);
        Student s6 = new Student(6, "Ally", "F", 20);

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);
        return studentList;
    }


    public static boolean boolFnctCheck(int number, Predicate predicate) {

        return predicate.test(number);
    }

}
