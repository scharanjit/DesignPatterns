/* 
 * Filename : Manager.java
 * Interface : Manager
 * Author : charanjit.singh 
 * Date : December 28, 2015
 * Purpose : This class does the function of booking
 * Description : This class find free tables,add new tables & gives the list of available tables  */

package design.patterns.z.problems10.educative.RestaurantReservationSystem.impl;

import design.patterns.z.problems10.educative.RestaurantReservationSystem.intrface.GuestManager;
import design.patterns.z.problems10.educative.RestaurantReservationSystem.intrface.TableManager;
import design.patterns.z.problems10.educative.RestaurantReservationSystem.pojo.Guest;
import design.patterns.z.problems10.educative.RestaurantReservationSystem.pojo.Reservation;
import design.patterns.z.problems10.educative.RestaurantReservationSystem.pojo.Table;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


/**
 * @author CN
 */
public class Manager {
    static final Map<String, String> ocpTables = new HashMap<String, String>();
    private GuestManager um;

    private TableManager tm;
    static int resIds = 1000;


    public Manager(GuestManager um, TableManager tm) {
        this.um = um;
        this.tm = tm;
    }

    public Manager() {
        um = new GuestManagerImpl();
        tm = new TableManagerImpl();
    }

    public GuestManager getUm() {
        return um;
    }

    public void setUm(GuestManager um) {
        this.um = um;
    }

    public TableManager getTm() {
        return tm;
    }

    public void setTm(TableManager tm) {
        this.tm = tm;
    }

    public void createReservation(Reservation reservation) {
        int cap = reservation.getGuest().getCap();

        boolean success = createGuestReservation(reservation, reservation.getGuest());
        if (success == false) {
            System.out.println("Reservation unsuccessful for " + reservation.getGuest().getFirstname() + " " + reservation.getGuest().getSurname());
        }
    }

    public boolean createGuestReservation(Reservation reservation, Guest guest) {
        boolean success = false;

        Collection<Table> freeTables = new HashSet<Table>();
        freeTables = tm.freeTables(reservation.getDate(), reservation.getTime(), reservation.getDuration());
        if (freeTables != null) {
            for (Table t : freeTables) {
                String temp = reservation.getDate() + reservation.getTime() + reservation.getDuration();
                if (0 != freeTables.size() && t.getCapacity() >= reservation.getGuest().getCap()) {
                    int resx = resId();
                    reservation.setReservationId(resx);
//             ocpTables.put( ""+reservation.getTable().getTableId(),temp);
                    ocpTables.put(temp + reservation.getTable().getTableId(), temp);
                    System.out.println("Table is booked for user " + reservation.getGuest().getFirstname() + " " + reservation.getGuest().getSurname() + " with reservation id " + resIds);
                    success = true;
                    return success;

                }
            }
        } else {
            return success;
        }

        return success;
    }

    private int resId() {

        resIds++;
        return resIds;
    }

}
