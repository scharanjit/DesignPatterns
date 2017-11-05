/* 
 * Filename : TableManagerImpl.java
 * Interface : TableManagerImpl
 * Author : charanjit.singh 
 * Date : December 28, 2015
 * Purpose : This class gives body to the methods of interface TableManager
 * Description : This class find free tables,add new tables & gives the list of available tables  */
package design.patterns.z.problems10.educative.RestaurantReservationSystem.impl;

import design.patterns.z.problems10.educative.RestaurantReservationSystem.intrface.TableManager;
import design.patterns.z.problems10.educative.RestaurantReservationSystem.pojo.Table;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static design.patterns.z.problems10.educative.RestaurantReservationSystem.impl.Manager.ocpTables;

/**
 * @author CN
 */
public class TableManagerImpl implements TableManager {

    static final Set<Table> tableSet = new HashSet<Table>(); //set to store tables

    public TableManagerImpl() {
    }

    @Override
    public boolean addTable(Table table) {
        try {
            tableSet.add(table); //adding table into Colelction Set<table>
            System.out.println("Table added with id " + table.getTableId() + " & capacity " + table.getCapacity());
        } catch (Exception ex) {
            //   ex.printStackTrace();
            return false;
        }

        return true;

    }

    @Override
    public Table findTableByID(int id) {
        try {
            for (Table t : tableSet) {
                if (t.getTableId() == id) {
                    Table newTable = new Table();
                    newTable.setCapacity(t.getCapacity());
                    newTable.setTableId(t.getTableId());
                    return newTable;
                }
            }
        } catch (Exception e) {
            //  e.printStackTrace();
        }
        System.out.println("Table id" + id + " does exist..");

        return null;
    }

    @Override
    public Collection<Table> freeTables(String date, int time, int duration) {
        int startTime = 1600; //opening time of restaurant
        int endTime = 2300;   //closing time of restaurant
        if (date == null) {
            System.out.println("Date cannot be null");
            return null;
        }
        if (time < 0 || time < startTime || time > endTime) {

            System.out.println("Time must be positive");
            return null;
        }
        if (duration < 0) {
            System.out.println("Duration must be positive");
            return null;
        }

        Set<Table> allTables = new HashSet<Table>();
        allTables = (Set<Table>) allTables();
        try {

            String temp = date + time + duration;
            String res = "" + time + duration;
//            if (res < startTime || res > endTime) {
//                
//                return null;
//            }
            int i = 1;
            if (ocpTables.size() > 0) {  //checking the already booked tables
                Iterator it = ocpTables.keySet().iterator();
                while (it.hasNext()) {
                    String value = (String) it.next();
                    String value1 = value.substring(0, 10);  //getting date
                    String due = value.substring(10, 16);
                    if (ocpTables.containsValue(temp) && value1.equals(date) && due.equals(res)) {
                        Table ts1 = findTableByID(i);
                        i++;
                        allTables.remove(ts1);  //removing it from list of free tables
                    }
//                    }
                }
            }
        } catch (Exception e) {
            //   e.printStackTrace();
        }
        return allTables; //this will return free table 
    }

    @Override
    public Collection<Table> allTables() {
        Table table = new Table();
        Set<Table> tables = new HashSet<Table>();
        TableManager tm = new TableManagerImpl();
        try {
            for (int i = 1; i <= tableSet.size(); i++) {
                table = tm.findTableByID(i);
                tables.add(table); //add the list of all tables available in our collection
            }
        } catch (Exception e) {
            //    e.printStackTrace();
        }
        return tables;
    }

}
