/* 
 * Filename : Guest.java
 * Class : Guest
 * Author : charanjit.singh 
 * Date : December 28, 2015
 * Purpose : Contains the Guest information came to restaurant
 * Description :  Contains the Guest information came to restaurant */
package design.patterns.z.problems10.educative.RestaurantReservationSystem.pojo;

/**
 * @author CN
 */
public class Guest {

    private String firstname;
    private String surname;
    private String email;
    private String password;
    private int cap;

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public Guest() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        email.toLowerCase();
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Guest other = (Guest) obj;
        if ((this.email == null) ? (other.email != null) : !this.email.equals(other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 69 * hash + (this.email != null ? this.email.hashCode() : 0);
        return hash;
    }

}
