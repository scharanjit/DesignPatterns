package intermediate.one.adapterpattern.example;

public class EmployeeAdapterLdap implements Employee {

  private EmployeeLDAP employeeLDAP;

  public EmployeeAdapterLdap(EmployeeLDAP employeeFromLDAP) {
    this.employeeLDAP = employeeFromLDAP;
  }

  @Override
  public String getId() {
    return employeeLDAP.getCn();
  }

  @Override
  public String getFirstName() {
    return employeeLDAP.getGivenName();
  }

  @Override
  public String getLastName() {
    return employeeLDAP.getSurname();
  }

  @Override
  public String getEmail() {
    return employeeLDAP.getMail();
  }
}
