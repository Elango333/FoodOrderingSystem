package com.Home;

import com.Customer.Customer;
import com.mainPage.CustomerMainpage;
import com.order.Orders;
import java.util.ArrayList;

public class HomePage {
    
    
    public static void main(String[] args) {
        CustomerMainpage mainpage = new CustomerMainpage();
        ArrayList<Customer> customerList = new ArrayList<>();
        ArrayList<Orders> deliveryOrderList = new ArrayList<>();
        RedirectToLoginPage redirectPage = new RedirectToLoginPage(mainpage, customerList, deliveryOrderList);
        redirectPage.callMenu();
    } 
    
    
}
