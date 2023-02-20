/**
 * Name: Shahla Hassan
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/20/2023
 * File Name: TestDelivery.java
 * Description: Testing the system whether all the drivers are getting notified when a single request is added to arraylist
 */
package assignment2;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.shops.DeliveryRequestClass;
import org.junit.Test;
import edu.bu.met.cs665.shops.DriverClass;
import edu.bu.met.cs665.shops.ShopClass;
public class TestDelivery {
@Test
    public void TestDriver(){
       //GIVEN
       //Adding 6 instances of Driver
        DriverClass driver1 = new DriverClass("John");
        DriverClass driver2 = new DriverClass("Smith");
        DriverClass driver3 = new DriverClass("Jane");
        DriverClass driver4 = new DriverClass("Doe");
        DriverClass driver5 = new DriverClass("Will");
        DriverClass driver6 = new DriverClass("Tom");
       //Adding 1 instance of Shop
        ShopClass shop1 = new ShopClass();
      //Adding 1 instance of Delivery Request
        DeliveryRequestClass request = new DeliveryRequestClass("1", "Warren Street","Jeans");
        //Registering all the 6 drivers to shop
        shop1.register(driver1);
        shop1.register(driver2);
        shop1.register(driver3);
        shop1.register(driver4);
        shop1.register(driver5);
        shop1.register(driver6);

        //WHEN
       //Adding Delivery Request to Shop
        shop1.addDeliveryRequest(request);

        String[] actualDeliveryIDs = new String[6];
        String [] expectedResult = {"1","1","1","1","1","1"}; //All the 6 drivers get notified of 1 delivery request expected array

        //Calling the method to get last delivery request ID of all the 6 drivers and adding to actualDeliveryIDs array.
        String result =driver1.getLastAddedDeliveryRequest();
        actualDeliveryIDs[0] = result;
        result =driver2.getLastAddedDeliveryRequest();
        actualDeliveryIDs[1] = result;
        result =driver3.getLastAddedDeliveryRequest();
        actualDeliveryIDs[2] = result;
        result =driver4.getLastAddedDeliveryRequest();
        actualDeliveryIDs[3] = result;
        result =driver5.getLastAddedDeliveryRequest();
        actualDeliveryIDs[4] = result;
        result =driver6.getLastAddedDeliveryRequest();
        actualDeliveryIDs[5] = result;


   //THEN
    //Comparing the expectedArray and the actual Array result
    assertArrayEquals(expectedResult,actualDeliveryIDs);
    }


}
