
package com.Hotel;

import com.Food.Food;
import java.util.ArrayList;

public class Hotel {
    private String hotelName;
    private String address;
    private ArrayList<Food> foodList = new ArrayList<>();
    private ArrayList<Food> customerOrders = new ArrayList<>();
    private ArrayList<ArrayList<Food>> orderList = new ArrayList<>();

    public ArrayList<ArrayList<Food>> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<ArrayList<Food>> orderList) {
        this.orderList = orderList;
    }
    
    public ArrayList<Food> getCustomerOrders() {
        return customerOrders;
    }

    public void setCustomerOrders(ArrayList<Food> customerOrders) {
        this.customerOrders = customerOrders;
    }

    public ArrayList<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(ArrayList<Food> foodList) {
        this.foodList = foodList;
    }
    
    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
