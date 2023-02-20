/**
 * Name: Shahla Hassan
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/20/2023
 * File Name: Shop.java
 * Description: Creates a Shop Interface to declare the methods required
 */
package edu.bu.met.cs665.shops;

public interface Shop {
    public void register(Driver d);

    public void unregister(Driver d);

    public void notifyDriver(DeliveryRequestClass dr);

}
