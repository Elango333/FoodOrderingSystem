package com.HotelAdmin;

import com.Food.Food;
import com.Hotel.Hotel;
import java.util.ArrayList;
import java.util.Iterator;

public class HotelAdminFunctionality implements HotelAdminFuncInterface{
    Hotel hotel;
    HotelAdminDisplay adminDisplay = new HotelAdminDisplay();
    public HotelAdminFunctionality(Hotel hotel){
        this.hotel = hotel;
    }
    
    public void Showfeatures(){
        int option = adminDisplay.askOptionForHotelAdmin();
        switch(option){
            case 1:
            addFood();
            Showfeatures();
            break;
            case 2:
            removeFood();
            Showfeatures();
            break;
            case 3:
            break;
        }
        
    }
    
    @Override
    public void addFood() {
        Food food = adminDisplay.addFoodToList();
        ArrayList<Food> foodList = hotel.getFoodList();
        foodList.add(food);
        System.out.println("Food added successfully");


    }

    @Override
    public void removeFood() {
        String foodName = adminDisplay.removeFoodfromList();
        ArrayList<Food> foodList = hotel.getFoodList();
        Food removeFood = null;
        for (Food food : foodList) {
            if(food.getFoodName().equals(foodName)){
                removeFood = food;
            }
        }
        foodList.remove(removeFood);
        System.out.println("Food removed successfully");
    }
    
}
