package com.mainPage;

import com.Hotel.Hotel;
import java.util.ArrayList;
import java.util.Scanner;


public class CustomerMainPageDisplay {
    
    public int showMainPageDisplay(){
    Scanner showMainpageSnr = new Scanner(System.in);
    System.out.println("\n" +
      "╔═══════════════════════════════════╗\n" +
      "║                                   ║\n" +
      "║    Search hotel      - Press (1)  ║\n" +
      "║                                   ║\n" +
      "║    Select hotel      - Press (2)  ║\n" +
      "║                                   ║\n" +
      "╚═══════════════════════════════════╝\n\n");
    int option = showMainpageSnr.nextInt();
    return option;
    }
    
    public void displayHotels(ArrayList<Hotel> hotelList){
            System.out.println("----- HotelList -----\n");
        for(Hotel hotel : hotelList){
            System.out.println("----- ----- ------");
            System.out.println("Hotel name    : " + hotel.getHotelName());
            System.out.println("Hotel address : " + hotel.getAddress());
            System.out.println("----- ----- ------\n");
        }
    }
    
    public void displaySelectedHotel(Hotel hotel){
            System.out.println("----- ----- ------");
            System.out.println("Hotel name    : " + hotel.getHotelName());
            System.out.println("Hotel address : " + hotel.getAddress());
            System.out.println("----- ----- ------");
    }
    
   
}
