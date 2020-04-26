package intermediate.one.adapterpattern.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

  public List<Employee> getClientList() {

    List<Employee> employees = new ArrayList<>();

    Employee employeeFromDB = new EmployeeDB("1234","John", "Wick","john.wick@gmail.com");

    employees.add(employeeFromDB);


    EmployeeLDAP employeeFromLDAP= new EmployeeLDAP("1234","John", "Wick","john.wick@gmail.com");

//    employees.add(employeeFromLDAP);

    employees.add(new EmployeeAdapterLdap(employeeFromLDAP));


    EmployeeCSV employeeCSV = new EmployeeCSV("123,Sherlock,Holmes,sherlock.holmes@gmail.com");


    employees.add(new EmployeeAdapterCSV(employeeCSV));
    return employees;
  }
}
