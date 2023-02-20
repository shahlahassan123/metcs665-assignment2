/**
 * Name: Shahla Hassan
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/20/2023
 * File Name: DriverClass.java
 * Description: Creates a Driver class to store the name of the driver, list of delivery requests and update method
 * to add the delivery request
 */
package edu.bu.met.cs665.shops;

import java.util.ArrayList;

public class DriverClass implements Driver {
    String name;
    DeliveryRequestClass delivery;

    private ArrayList<DeliveryRequestClass> deliveryRequests;

    public DriverClass(String name){
        this.name = name;
        deliveryRequests = new ArrayList<DeliveryRequestClass>();
    }


    /** This method adds the given driver request to the arraylist
     * Argument DeliveryRequestClass
     * Returns void **/
    public void update(DeliveryRequestClass delivery){
        String result = "Driver notified with the delivery request " + delivery.deliveryID;
        deliveryRequests.add(delivery);
    }
    /** This method returns the latest delivery request id.
     * Argument None
     * Returns last delivery request id **/
    public String getLastAddedDeliveryRequest(){
        int n = deliveryRequests.size();
        String res = deliveryRequests.get(n-1).deliveryID;
        return res;
    }


}
