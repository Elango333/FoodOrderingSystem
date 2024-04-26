package com.Customer;

import com.Food.Food;
import java.util.Scanner;


public class CustomerDisplay {
    
    public int showFeatures(){
      Scanner showFeaturesSnr = new Scanner(System.in);
    System.out.println("\n" +
      "╔═══════════════════════════════════════╗\n" +
      "║                                       ║\n" +
      "║   Order food             - Press (1)  ║\n" +
      "║                                       ║\n" +
      "║   cancel food            - Press (2)  ║\n" +
      "║                                       ║\n" +
      "║   view order details     - Press (3)  ║\n" +
      "║                                       ║\n" +
      "║   Back                   - Press (4)  ║\n" +
      "║                                       ║\n" +
      "╚═══════════════════════════════════════╝\n\n");
    int option = showFeaturesSnr.nextInt();
    return option;
    }
    
    
    public String cancelFood(){
        Scanner cancelFoodSnr = new Scanner(System.in);
        System.out.println("Enter the food name to cancel");
        String foodname = cancelFoodSnr.nextLine();
        return foodname;
    }
    
    public void displayOrderList(Food food){
        System.out.println("----- ----- -----");
        System.out.println("Food name     : " + food.getFoodName());
        System.out.println("Food type     : " + food.getFoodType());
        System.out.println("Food price    : " + food.getPrice());
        System.out.println("Food quantity : " + food.getQuantity());
        System.out.println("----- ----- -----\n");
    }
    
    public int askMoreFood(){
     Scanner showFeaturesSnr = new Scanner(System.in);
    System.out.println("\n" +
      "╔═══════════════════════════════════════╗\n" +
      "║                                       ║\n" +
      "║   add more food          - Press (1)  ║\n" +
      "║                                       ║\n" +
      "║   Back                   - Press (2)  ║\n" +
      "║                                       ║\n" +
      "╚═══════════════════════════════════════╝\n\n");
    int option = showFeaturesSnr.nextInt();
    return option;
    }
}
