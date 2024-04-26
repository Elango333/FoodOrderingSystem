package com.Hotel;

import com.Food.Food;
import java.util.Scanner;


public class HotelFuncDisplay {
    
    public void displayFoods(Food food){
        System.out.println("----- ----- -----");
        System.out.println("Food name     : " + food.getFoodName());
        System.out.println("Food type     : " + food.getFoodType());
        System.out.println("Food price    : " + food.getPrice());
        System.out.println("Food quantity : " + food.getQuantity());
        System.out.println("----- ----- -----\n");
    }
    
    public int askOptionForFood(){
    Scanner showMainpageSnr = new Scanner(System.in);
    System.out.println("\n" +
      "╔═══════════════════════════════════╗\n" +
      "║                                   ║\n" +
      "║    Search food      - Press (1)   ║\n" +
      "║                                   ║\n" +
      "║    Select food      - Press (2)   ║\n" +
      "║                                   ║\n" +
      "╚═══════════════════════════════════╝\n\n");
    int option = showMainpageSnr.nextInt();
    return option;
    }
    
    public int askOptionForSearch(){
    Scanner showMainpageSnr = new Scanner(System.in);
    System.out.println("\n" +
      "╔═══════════════════════════════════╗\n" +
      "║                                   ║\n" +
      "║    Veg              - Press (1)   ║\n" +
      "║                                   ║\n" +
      "║    Non-Veg          - Press (2)   ║\n" +
      "║                                   ║\n" +
      "╚═══════════════════════════════════╝\n\n");
    int option = showMainpageSnr.nextInt();
    return option;
    }
    
}
