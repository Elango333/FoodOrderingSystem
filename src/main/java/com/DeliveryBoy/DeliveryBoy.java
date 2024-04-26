package com.DeliveryBoy;
import com.order.Orders;
import java.util.ArrayList;



public class DeliveryBoy {
   private ArrayList<Orders> deliveryOrderlist;
    public DeliveryBoy(ArrayList<Orders> deliveryOrderlist) {
        this.deliveryOrderlist = deliveryOrderlist;
    }

    
    public ArrayList<Orders> getOrderList() {
        return deliveryOrderlist;
    }    
    
}
