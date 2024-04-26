package com.DeliveryBoy;

import com.order.Orders;
import java.util.Scanner;

public class DeliveryBoyDisplay {
   
    public void deliverFoods(Orders order){
        System.out.println("----- ----- -----");
        System.out.println("Customer name    : " + order.getCustomerName());
        System.out.println("Customer address : " + order.getCustomerAddress());
        System.out.println("Hotel name       : " + order.getHotelname());
        System.out.println("Foods delivered successfully!!!");
        System.out.println("----- ----- -----\n\n");

    }
    
    
    public int showfeatures(){
   
     Scanner showFeaturesSnr = new Scanner(System.in);
    System.out.println("\n" +
      "╔═══════════════════════════════════════╗\n" +
      "║                                       ║\n" +
      "║   To Deliver foods       - Press (1)  ║\n" +
      "║                                       ║\n" +
      "║   Back                   - Press (2)  ║\n" +
      "║                                       ║\n" +
      "╚═══════════════════════════════════════╝\n\n");
    int option = showFeaturesSnr.nextInt();
    return option;
    }
}
