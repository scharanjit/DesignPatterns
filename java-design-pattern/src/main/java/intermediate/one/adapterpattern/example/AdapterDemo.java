package intermediate.one.adapterpattern.example;

import java.util.List;

public class AdapterDemo {

  public static void main(String[] args) {
    EmployeeClient employeeClient = new EmployeeClient();

    List<Employee> employees = employeeClient.getClientList();

    System.out.println(employees.size());
    System.out.println(employees);



  }

}
