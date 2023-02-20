/**
 * Name: Shahla Hassan
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/20/2023
 * File Name: ShopClass.java
 * Description: Creates a Shop class to store the list of drivers as well as delivery requests
 */
package edu.bu.met.cs665.shops;
import java.util.ArrayList;

public class ShopClass implements Shop {
    private ArrayList<Driver> drivers;
    private ArrayList<DeliveryRequestClass> deliveryRequests;

    public ShopClass(){
        drivers = new ArrayList<Driver>();
        deliveryRequests = new ArrayList<DeliveryRequestClass>();
    }
/** This method adds the given driver to the arraylist
 * Argument Driver
 * Returns void **/
    public void register(Driver d){
        // Add driver to the ArrayList
        drivers.add(d);
    }
    /** This method remove the given driver from the arraylist
     * Argument Driver
     * Returns void **/
    public void unregister(Driver d){

        int driverIndex = drivers.indexOf(d);
        // Display message
        System.out.println("Driver " + (driverIndex+1) + " unregistered");

        // Removes driver from the ArrayList
        drivers.remove(driverIndex);

    };
    /** This method notifies  the given driver about the delivery request
     * Argument DriverRequestClass
     * Returns void **/
    public void notifyDriver(DeliveryRequestClass dr){
        for(Driver driver : drivers){
         //Notifying every driver
            driver.update(dr);
        }
    }

    /** This method adds  the delivery request to the arraylist and also notifies the driver
     * Argument DriverRequestClass
     * Returns void **/
    public void addDeliveryRequest(DeliveryRequestClass dr){
        // Add requests to the ArrayList
        deliveryRequests.add(dr);
        notifyDriver(dr); //Notifying driver that a new delivery request has come in
    }

    /** This method remove  the delivery request from the arraylist
     * Argument DriverRequestClass
     * Returns void **/
    public void removeDeliveryRequest(DeliveryRequestClass dr){
        int deliveryRequestIndex = deliveryRequests.indexOf(dr);
        // Display message
        System.out.println("Delivery Request  completed");

        // Removes requests from the ArrayList
        deliveryRequests.remove(deliveryRequestIndex);
    }

    /** This method returns  the delivery requests  arraylist
     * Argument None
     * Returns DeliveryRequestClass Arraylist **/
    public ArrayList<DeliveryRequestClass> getDeliveryRequests(){
        return deliveryRequests;
    }


}
