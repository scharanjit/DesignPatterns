/* 
 * Filename : GuestManager.java
 * Interface : GuestManager
 * Author : charanjit.singh 
 * Date : December 28, 2015
 * Purpose : 
 * Description :   */
package design.patterns.z.problems10.educative.RestaurantReservationSystem.intrface;

import design.patterns.z.problems10.educative.RestaurantReservationSystem.pojo.Guest;

/**
 * @author CN
 */
public interface GuestManager {

    /*
    This method add the guest based upon their information
    */
    boolean addGuest(Guest guest);

    /*
    this method find the gues based upon their email id if exist
    */
    Guest findGuest(String email);


}
