/* 
 * Filename : Reservation.java
 * Class : Reservation
 * Author : charanjit.singh 
 * Date : December 28, 2015
 * Purpose : Contains the Reservation information done by the guest
 * Description :  Contains the Reservation information done by the guest */
package design.patterns.z.problems10.educative.RestaurantReservationSystem.pojo;

/**
 * @author CN
 */
public class Reservation {

    private int reservationId;
    private Guest guest;
    private Table table;
    private String date;
    private int time;
    private int duration;


    protected Reservation(Guest user, Table table) {
        this.guest = user;
        this.table = table;
    }

    public Reservation() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reservation other = (Reservation) obj;
        if (this.reservationId != other.reservationId) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 2;
        hash = 28 * hash + this.reservationId;
        return hash;
    }
}


