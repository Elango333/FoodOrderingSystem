package com.Customer;


import com.Food.Food;
import com.Hotel.HotelFuncInterface;
import com.order.Orders;
import java.util.ArrayList;



public class CustomerFunctionality implements CustomerFuncInterface{
    private Customer customer;
    private HotelFuncInterface hotelFunc;
    private ArrayList<Orders> deliveryOrderlist;
    private ArrayList<Food> cusOrderList = new ArrayList<>();
    public CustomerFunctionality(Customer customer, HotelFuncInterface hotelFunc, ArrayList<Orders> deliveryOrderlist) {
       this.customer = customer;
       this.hotelFunc = hotelFunc;
       this.deliveryOrderlist = deliveryOrderlist;
    }
    
    
    CustomerDisplay customerDisplay = new CustomerDisplay();

    @Override
    public void orderFood() {
        hotelFunc.displayFood();
        String foodname = hotelFunc.askOption();
        Food food = hotelFunc.orderFood(foodname);
        cusOrderList.add(food);
        addMoreOrder();        
    }

    @Override
    public void cancelFood() {
       String foodname = customerDisplay.cancelFood();
       for (ArrayList<Food> order : customer.getOrderList()) {
             for (Food food : order) {
                 if (food.getFoodName().equals(foodname)) {
                     order.remove(food);
                     hotelFunc.cancelFood(food);
                     break;
                 }
             }
      }

    }

    
    @Override
    public void viewOrderDetails() {
         for (ArrayList<Food> order : customer.getOrderList()) {
             for (Food food : order) {
                 customerDisplay.displayOrderList(food);
             }
             
         }
    }
    
    public void showFeatures(){
        int option = customerDisplay.showFeatures();
        
        switch(option){
            case 1:
                orderFood();
                showFeatures();
                break;
            case 2:
                cancelFood();
                showFeatures();
                break;
            case 3:
                viewOrderDetails();
                showFeatures();
                break;
            case 4:
                break;
            default:
                
        }
        
    }   
    
    public void addMoreOrder(){
        int option = customerDisplay.askMoreFood();
        
        switch(option){
            case 1:
                orderFood();
                break;
            case 2:
              customer.getOrderList().add(cusOrderList);
              Orders order = new Orders();
              order.setCustomerName(customer.getName());
              order.setCustomerAddress(customer.getAddress());
              order.setHotelname(hotelFunc.getHotelName());
              order.getOrderList().add(cusOrderList);
              deliveryOrderlist.add(order);
              System.out.println("Food ordered successfully");   
              break;
        }
    }
    
    

}
