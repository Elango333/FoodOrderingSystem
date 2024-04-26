package com.Hotel;
import com.Food.Food;
import java.util.ArrayList;
import java.util.Scanner;

public class HotelFunctionality implements HotelFuncInterface{
    Hotel hotel;
    HotelFuncDisplay hotelDisplay = new HotelFuncDisplay();
    public HotelFunctionality(Hotel hotel) {
       this.hotel = hotel;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    
    

    @Override
    public Food orderFood(String foodname) {
        for(Food food : hotel.getFoodList()){
            System.out.println("foodname " + food.getFoodName());
             if(food.getFoodName().equals(foodname)){ 
            hotel.getCustomerOrders().add(food);
            hotel.getOrderList().add(hotel.getCustomerOrders());
            return food;
             }
        }
   
        return null;
    }

    @Override
    public String selectFood() {
        Scanner searchFoodSnr = new Scanner(System.in);
        System.out.println("Enter the food name");
        String foodname = searchFoodSnr.nextLine();
        for(Food food : hotel.getFoodList()){
            if(food.getFoodName().equals(foodname)){
                return foodname;
            }
        }
        return "";
    }

    @Override
    public void cancelFood(Food selectedFood) {
       for (ArrayList<Food> order : hotel.getOrderList()) {
             for(Food food : order) {
                 if(food.getFoodName().equals(selectedFood.getFoodName())){
                     order.remove(food);
                     System.out.println("Food canceled successfully");
                    break;
                 }
             }
       }
    } 

    
    @Override
    public String getHotelName(){
      return hotel.getHotelName();
    }
    
    
     @Override   
     public String askOption(){
        int option = hotelDisplay.askOptionForFood();
        String foodname = null;
        switch(option){
            case 1:
                searchFood();
                
                break;
            case 2:
                 foodname = selectFood();
               return foodname;
                
        }
        return foodname;
    }

    @Override
    public void searchFood() {
       int option = hotelDisplay.askOptionForSearch();
       switch(option){
           case 1:
            for(Food food : hotel.getFoodList()){
                if(food.getFoodType().equals("Veg")){
                    hotelDisplay.displayFoods(food);
                    
                }
            }
            break;
           case 2:
            for(Food food : hotel.getFoodList()){
                if(food.getFoodType().equals("NonVeg")){
                    hotelDisplay.displayFoods(food);
                }
            }   
       }
       askOption();
    }

    @Override
    public void displayFood() {
         for(Food food : hotel.getFoodList()){
             hotelDisplay.displayFoods(food);
         }   
    }
}
