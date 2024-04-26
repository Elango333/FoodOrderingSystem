package com.HotelAdmin;

import com.Food.Food;
import java.util.Scanner;


public class HotelAdminDisplay {
    
    public int askOptionForHotelAdmin(){
    Scanner hotelAdminSnr = new Scanner(System.in);
    System.out.println("\n" +
      "╔═══════════════════════════════════╗\n" +
      "║                                   ║\n" +
      "║   Add food           - Press (1)  ║\n" +
      "║                                   ║\n" +
      "║   remove food        - Press (2)  ║\n" +
      "║                                   ║\n" +
      "║   Back               - Press (3)  ║\n" +
      "║                                   ║\n" +
      "╚═══════════════════════════════════╝\n\n");
    int option = hotelAdminSnr.nextInt();
    return option;
  }
    
    public Food addFoodToList(){
        Scanner addFoodSnr = new Scanner(System.in);
        Food food = new Food();
        System.out.println("Enter the food name");
        String foodname = addFoodSnr.nextLine();
        System.out.println("Enter the food type");
        String foodType = addFoodSnr.nextLine();
        System.out.println("Enter the price");
        int price = addFoodSnr.nextInt();
        System.out.println("Enter the quantity");
        int quantity = addFoodSnr.nextInt();
        food.setFoodName(foodname);
        food.setFoodType(foodType);
        food.setPrice(price);
        food.setQuantity(quantity);
        return food;
    }
    
    public String removeFoodfromList(){
        Scanner removeFoodSnr = new Scanner(System.in);
        System.out.println("Enter the food name to remove");
        String foodName = removeFoodSnr.nextLine();
        return foodName;
    }
    
}
