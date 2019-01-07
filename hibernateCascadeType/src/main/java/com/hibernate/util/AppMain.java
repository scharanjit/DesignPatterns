package com.hibernate.util;

import com.hibernate.model.Subject;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Student;

public class AppMain {

    public static void main(String[] args) {
        // Creating the configuration instance & passing the hibernate configuration file.
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");

        // Hibernate session object to start the db transaction.
        Session s = config.buildSessionFactory().openSession();

        // Fetching the data from the database.
        int student_id = 1;
        Student student = s.get(Student.class, student_id);

//        System.out.println(student.toString());

        // Deleting the data from the database.
        s.getTransaction().begin();

        s.remove(student);

        s.getTransaction().commit();

        // Closing the session object.
        s.close();


        addStudent();
    }

    private static void addStudent() {
        // Creating the configuration instance & passing the hibernate configuration file.
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");

        // Hibernate session object to start the db transaction.
        Session s = config.buildSessionFactory().openSession();

        // Fetching the data from the database.
        Subject sub = new Subject();
        sub.setName("Vehle");

        Student student = new Student();
        student.setName("Test Student");
        student.setAge(20);
        student.setSubj(sub);



        System.out.println(student.toString());

        // Deleting the data from the database.
        s.getTransaction().begin();

        s.persist(sub);
        s.persist(student);

        s.getTransaction().commit();

        // Closing the session object.
        s.close();

    }
}