/* 
 * Filename : GuestManagerImpl.java
 * Interface : GuestManagerImpl
 * Author : charanjit.singh 
 * Date : December 28, 2015
 * Purpose : This class does the function of guest management
 * Description : This class add new guest  */

package design.patterns.z.problems10.educative.RestaurantReservationSystem.impl;

import design.patterns.z.problems10.educative.RestaurantReservationSystem.intrface.GuestManager;
import design.patterns.z.problems10.educative.RestaurantReservationSystem.pojo.Guest;

import java.util.HashSet;
import java.util.Set;

/**
 * @author CN
 */
public class GuestManagerImpl implements GuestManager {

    Set<Guest> setGuest;

    public GuestManagerImpl() {
        this.setGuest = new HashSet<Guest>();
    }


    @Override
    public boolean addGuest(Guest user) {
        setGuest.add(user);
        return true;
    }


    @Override
    public Guest findGuest(String email) {
        for (Guest s : setGuest) {
            if (s.getEmail().equals(email)) {
                Guest newUser = new Guest();
                newUser.setFirstname(s.getFirstname());
                newUser.setPassword(s.getPassword());
                newUser.setSurname(s.getSurname());
                newUser.setCap(s.getCap());
                return newUser;
            }
        }
        System.out.println("Email id Not found");
        return null;

    }


}
