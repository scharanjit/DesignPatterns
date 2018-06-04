package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class Solution_1 {

    public static void main(String[] args) {


        // Given a list of employees, you need to filter all the employee whose age
        // is greater than 20 and print the employee names.(Java 8 APIs only)
        List<Employee> employeeList = createEmployeeList();

        List<String> employeeFilteredList = employeeList.stream()
                .filter(e -> e.getAge() > 20)
                .map(Employee::getName)
                .collect(Collectors.toList());

        employeeFilteredList.forEach((name) -> System.out.println(name));

        //Given the list of employees, count number of employees with age 25?

        List<Employee> employeeList1 = createEmployeeList();

        long count = employeeList1.stream()
                .filter(e1 -> e1.getAge() > 25).count();


        System.out.println("Number of employees with age 25 is : " + count);


        // Given the list of employees, find the employee with name “Mary”.

        List<Employee> employeeList2 = createEmployeeList();

        Optional<Employee> e1 = employeeList2.stream()
                .filter(e -> e.getName().equalsIgnoreCase("Marry")).findAny();

        if (e1.isPresent())
            System.out.println(e1.get());


        // Given a list of employee, find maximum age of employee?

        List<Employee> employeeList3 = createEmployeeList();

        OptionalInt max = employeeList3.stream()
                .mapToInt(Employee::getAge).max();
        if (max.isPresent())
            System.out.println("Maximum age of employee is : " + max.getAsInt());


        // Given a list of employees, sort all the employee on the basis of age? Use java 8 APIs only

        List<Employee> employeeList4 = createEmployeeList();

        employeeList4.sort((e4, e5) -> e4.getAge() - e5.getAge());
        employeeList4.forEach(System.out::println);


        // Join the all employee names with “,” using java 8?

        List<Employee> employeeList5 = createEmployeeList();

        List<String> employeeNames = employeeList5.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());

        String employeeNameStr = String.join(",", employeeNames);
        System.out.println("Employees are " + employeeNameStr);


        // Given the list of employee, group them by employee name?

        List<Employee> employeeList6 = createEmployeeList();

        Map<String, List<Employee>> map = employeeList6.stream().collect(Collectors.groupingBy(Employee::getName));

        map.forEach((name, employeeListTemp) -> System.out.println("Name :" + name + " ==>  " + employeeListTemp));
    }


    private static List<Employee> createEmployeeList() {

        Employee e1 = new Employee("John", 18);
        Employee e2 = new Employee("Jazz", 28);
        Employee e3 = new Employee("Marry", 19);
        Employee e4 = new Employee("Krish", 18);
        Employee e5 = new Employee("Manu", 16);
        Employee e6 = new Employee("Arshit", 7);
        Employee e7 = new Employee("Ziya", 21);

        Employee e8 = new Employee("John", 19);
        Employee e9 = new Employee("Jazz", 27);
        Employee e10 = new Employee("Marry", 16);
        Employee e11 = new Employee("Krish", 13);
        Employee e12 = new Employee("Manu", 18);
        Employee e13 = new Employee("Arshit", 32);
        Employee e14 = new Employee("Ziya", 31);


        List<Employee> employees = new ArrayList<>();

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        employees.add(e8);
        employees.add(e9);
        employees.add(e10);
        employees.add(e11);
        employees.add(e12);
        employees.add(e13);
        employees.add(e14);

        return employees;
    }
}
