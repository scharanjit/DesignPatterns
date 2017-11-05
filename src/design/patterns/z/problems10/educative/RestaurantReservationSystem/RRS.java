/* 
 * Filename : RRS.java
 * Interface : RRS
 * Author : charanjit.singh 
 * Date : December 28, 2015
 * Purpose : This is the main class to test all functionalities
 * Description : This is the main class to test all functionalities  */
package design.patterns.z.problems10.educative.RestaurantReservationSystem;


import design.patterns.z.problems10.educative.RestaurantReservationSystem.impl.GuestManagerImpl;
import design.patterns.z.problems10.educative.RestaurantReservationSystem.impl.Manager;
import design.patterns.z.problems10.educative.RestaurantReservationSystem.impl.TableManagerImpl;
import design.patterns.z.problems10.educative.RestaurantReservationSystem.intrface.GuestManager;
import design.patterns.z.problems10.educative.RestaurantReservationSystem.intrface.TableManager;
import design.patterns.z.problems10.educative.RestaurantReservationSystem.pojo.Guest;
import design.patterns.z.problems10.educative.RestaurantReservationSystem.pojo.Reservation;
import design.patterns.z.problems10.educative.RestaurantReservationSystem.pojo.Table;

import java.util.Collection;

/**
 * @author CN
 */
public class RRS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("***************************************************");
        System.out.println("***************************************************");
        System.out.println("Welcome to our Restaurant Online Resevation system");
        System.out.println("***************************************************");
        System.out.println("***************************************************");

        //table creation
        Table t1 = new Table();
        t1.setTableId(1);
        t1.setCapacity(4);

        Table t2 = new Table();
        t2.setTableId(2);
        t2.setCapacity(6);

        Table t3 = new Table();
        t3.setTableId(3);
        t3.setCapacity(4);

        Table t4 = new Table();
        t4.setTableId(4);
        t4.setCapacity(6);

        Table t5 = new Table();
        t5.setTableId(5);
        t5.setCapacity(4);

        Table t6 = new Table();
        t6.setTableId(6);
        t6.setCapacity(4);

        Table t7 = new Table();
        t7.setTableId(7);
        t7.setCapacity(4);

        TableManager tm = new TableManagerImpl();
//adding 7 tables
        tm.addTable(t1);
        tm.addTable(t2);
        tm.addTable(t3);
        tm.addTable(t4);
        tm.addTable(t5);
        tm.addTable(t6);
        tm.addTable(t7);

//        Guest creation
        Guest g1 = new Guest();
        g1.setFirstname("Charanjit");
        g1.setSurname("Singh");
        g1.setEmail("Abc@gmail.com");
        g1.setPassword("123");
        g1.setCap(4);
        //Guest 1 (Charanjit Singh)will always get the reservation as all constraint are fulfulled

        Guest g2 = new Guest();
        g2.setFirstname("Raman");
        g2.setSurname("Sharma");
        g2.setEmail("rmn@gmail.com");
        g2.setPassword("12343");
        g2.setCap(8);
        //Guest 2(Raman Sharma) will not get the reservation as 
        //Restaurant cannot cater his capacity

        Guest g3 = new Guest();
        g3.setFirstname("Harish");
        g3.setSurname("Gupta");
        g3.setEmail("hrs@gmail.com");
        g3.setPassword("12*3");
        g3.setCap(3);
        //Guest 3 Harish Gupta will not get the resrcvation because restaurant 
        //operation time is from 4 pm to 11 pm & he is asking for 11:30 pm

        Guest g4 = new Guest();
        g4.setFirstname("Sumit");
        g4.setSurname("Khelwal");
        g4.setEmail("smt@gmail.com");
        g4.setPassword("132*3");
        g4.setCap(6);

        Guest g5 = new Guest();
        g5.setFirstname("Chaitanya");
        g5.setSurname("Verma");
        g5.setEmail("cht@gmail.com");
        g5.setPassword("132*3");
        g5.setCap(6);


        GuestManager gm = new GuestManagerImpl();
        gm.addGuest(g1);
        gm.addGuest(g2);
        gm.addGuest(g3);
        gm.addGuest(g4);
        gm.addGuest(g5);

        //reservation for the guest i ,2, & 3
        Reservation r1 = new Reservation();
        r1.setDate("2015/12/25");
        r1.setTime(2030);
        r1.setDuration(30);
        r1.setGuest(gm.findGuest("Abc@gmail.com"));
        r1.setTable(tm.findTableByID(1));

        Reservation r2 = new Reservation();
        r2.setDate("2015/12/25");
        r2.setTime(2030);
        r2.setDuration(30);
        r2.setGuest(gm.findGuest("rmn@gmail.com"));
        r2.setTable(tm.findTableByID(2));

        Reservation r3 = new Reservation();
        r3.setDate("2015/12/25");
        r3.setTime(2430);
        r3.setDuration(30);
        r3.setGuest(gm.findGuest("hrs@gmail.com"));
        r3.setTable(tm.findTableByID(3));

        Reservation r4 = new Reservation();
        r4.setDate("2015/12/31");
        r4.setTime(1600);
        r4.setDuration(30);
        r4.setGuest(gm.findGuest("smt@gmail.com"));
        r4.setTable(tm.findTableByID(4));


        Reservation r5 = new Reservation();
        r5.setDate("2015/12/31");
        r5.setTime(1600);
        r5.setDuration(30);
        r5.setGuest(gm.findGuest("cht@gmail.com"));
        r5.setTable(tm.findTableByID(5));
        //reserving table
        Manager manager = new Manager(new GuestManagerImpl(), new TableManagerImpl());
        //success
        manager.createReservation(r1);

        //checking free table for same time & date when guest 1 reserved a table
        TableManager t = new TableManagerImpl();
        Collection<Table> m = t.freeTables("2015/12/25", 2030, 30);
        System.out.println("Free Table Same Time: " + m.size());

        //checking free table for DIFFERENT time & date when guest 1 reserved a table
        Collection<Table> m1 = t.freeTables("2015/12/25", 1900, 30);
        System.out.println("Free Table Diff Time: " + m1.size());

//        fail bec table capacity
        manager.createReservation(r2);


        //fail bec time not correct
        manager.createReservation(r3);

        //reserving table for guest 4      
        manager.createReservation(r4);

        //checking free tables for 31st december same time as sumit booked
        Collection<Table> m3 = t.freeTables("2015/12/31", 1600, 30);
        System.out.println("Free Table Same Time: " + m3.size());

        //checking free tables for 31st december DIFFERENT time as sumit booked
        Collection<Table> m4 = t.freeTables("2015/12/31", 1700, 30);
        System.out.println("Free Table Diff Time: " + m4.size());

        //reserving table for guest 5
        manager.createReservation(r5);

        //checking free tables for 31st december same time as sumit & chaitanya booked
        Collection<Table> m5 = t.freeTables("2015/12/31", 1600, 30);
        System.out.println("Free Table Same Time & same date as of sumit and chaitanya: " + m5.size());

        Collection<Table> m6 = t.freeTables("2015/12/31", 1900, 30);
        System.out.println("Free Table DIFFERENT Time & same date(*2015/12/31) as of both sumit and chaitanya: " + m6.size());

    }

}
