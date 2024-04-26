
package com.order;

import com.Food.Food;
import java.util.ArrayList;


public class Orders {
    private String customerName;
    private String Hotelname; 
    private String customerAddress;
    private ArrayList<ArrayList<Food>> orderList = new ArrayList<>();
    
    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
   

    public ArrayList<ArrayList<Food>> getOrderList() {
        return orderList;
    }
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public String getHotelname() {
        return Hotelname;
    }

    public void setHotelname(String Hotelname) {
        this.Hotelname = Hotelname;
    }
 
}
