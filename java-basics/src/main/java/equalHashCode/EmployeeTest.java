package equalHashCode;

import java.util.HashSet;

public class EmployeeTest {

  /**
   * If we comment hashcode method, results would be different
   * @param args
   */

  public static void main(String[] args) {
    Employee employee = new Employee("rajeev", 24);
    Employee employee1 = new Employee("rajeev", 25);
    Employee employee2 = new Employee("rajeev", 24);

    HashSet<Employee> employees = new HashSet<Employee>();
    employees.add(employee);

    System.out.println(employees.contains(employee2));
    System.out.println("employee.hashCode():  " + employee.hashCode()
        + "  employee2.hashCode():" + employee2.hashCode());


    System.out.println(employees.contains(employee1));
    System.out.println("employee.hashCode():  " + employee.hashCode()
        + "  employee2.hashCode():" + employee1.hashCode());
  }
}