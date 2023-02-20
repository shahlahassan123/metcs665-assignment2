/**
 * Name: Shahla Hassan
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/20/2023
 * File Name: DeliveryRequestClass.java
 * Description: Creates a Delivery Request Class to store the information regarding the delivery requests
 */

package edu.bu.met.cs665.shops;

public class DeliveryRequestClass {
    String deliveryID;
    String deliveryAddress;
    String deliveryProduct;

    public DeliveryRequestClass(String id, String address, String product){
        this.deliveryID = id;
        this.deliveryAddress = address;
        this.deliveryProduct = product;
    }
}
