/* 
 * Filename : Table.java
 * Class : Table
 * Author : charanjit.singh 
 * Date : December 28, 2015
 * Purpose : Contains the table information present in the restaurant
 * Description :  Contains the table information present in the restaurant */

package design.patterns.z.problems10.educative.RestaurantReservationSystem.pojo;

/**
 * @author CN
 */
public class Table {

    private int tableId;
    private int capacity;


    public Table() {
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Table other = (Table) obj;
        if (this.tableId != other.tableId) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 70 * hash + this.tableId;
        return hash;
    }


}
