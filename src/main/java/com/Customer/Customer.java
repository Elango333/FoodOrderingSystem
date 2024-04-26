package com.Customer;

import com.Food.Food;
import java.util.ArrayList;

public class Customer {
    private String name;
    private String mobileNumber;
    private String address;
    private ArrayList<ArrayList<Food>> orderList = new ArrayList<>();

    public ArrayList<ArrayList<Food>> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<ArrayList<Food>> orderList) {
        this.orderList = orderList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
