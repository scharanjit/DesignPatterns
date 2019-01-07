package com.hibernate.util;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Employee;

public class AppMain {

    public static void main(String[] args) {
        // Creating the configuration instance & passing the hibernate configuration file.
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");

        // Hibernate session object to start the db transaction.
        Session s = config.buildSessionFactory().openSession();

        // Storing the dummy employee data in the db.
        Employee emp1 = new Employee();
        emp1.setName("John Lark");
        emp1.setDesig("Lead");
        emp1.setDept("Technology");
        emp1.setSal(30000);

        Employee emp2 = new Employee();
        emp2.setName("Natalie Atlas");
        emp2.setDesig("Associate");
        emp2.setDept("Human Resource");
        emp2.setSal(24000);

        // Saving the data in the database.
        s.getTransaction().begin();

        s.save(emp1);

        s.save(emp2);

        s.getTransaction().commit();

        // Fetching the data from the db to demonstrate the optimistic locking.
        int employeeid = 2;
        Employee emp = s.get(Employee.class, employeeid);
        if(emp != null) {

            s.getTransaction().begin();

            // Updating the employee record and saving the db.
            emp.setDesig("Sr. Manager");
            s.update(emp);

            s.getTransaction().commit();
        } else {
            System.out.println("Employee details not found in the db with id= " + employeeid);
        }

        // Closing the session object.
        s.close();
    }
}