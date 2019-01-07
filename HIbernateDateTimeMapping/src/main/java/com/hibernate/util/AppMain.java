package com.hibernate.util;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Company;
import com.hibernate.model.Employee;

public class AppMain {

    public static void main(String[] args) {
        // Creating the config instance & passing the hibernate config file.
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");

        // Hibernate session object to start the db transaction.
        Session s = config.buildSessionFactory().openSession();

        Employee emp = new Employee();
        emp.setEname("John Lark-1");

        Date joiningDate = new Date();

        Company comp1 = new Company();
        comp1.setCname("Abc pvt. ltd.");
        comp1.setDoj(joiningDate);
        comp1.setEmployee(emp);

        Company comp2 = new Company();
        comp2.setCname("Xyz pvt. ltd.");
        comp2.setDoj(joiningDate);
        comp2.setEmployee(emp);

        emp.getCompanies().add(comp1);
        emp.getCompanies().add(comp2);

        // Saving the data in the database.
        s.getTransaction().begin();

        s.save(emp);

        s.getTransaction().commit();

        // Fetching the data from the database.
        System.out.println(":::: Employee Details ::::");

        int eid = 1;
        Employee employee = s.get(Employee.class, eid);

        System.out.println(employee.getEid() + "\t" + employee.getEname());

        List<Company> companies = employee.getCompanies();
        for(Company c : companies) {
            System.out.println(c.getCid() + "\t" + c.getCname() + "\t" + c.getDoj());
        }

        // Closing the session object.
        s.close();
    }
}