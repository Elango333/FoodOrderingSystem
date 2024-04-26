package com.mainPage;

import com.Hotel.Hotel;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerMainPageFunctionality implements CustomerMainPageFuncInterface{
 ArrayList<Hotel> hotelList;
 CustomerMainPageDisplay customerDisplay = new CustomerMainPageDisplay();
    public CustomerMainPageFunctionality(ArrayList<Hotel> hotelList) {
      this.hotelList = hotelList;  
    }
    
    
    
    @Override
    public Hotel selectHotel() {
        Hotel selectedHotel = null;
      Scanner searchHotelSnr = new Scanner(System.in);
      System.out.println("Enter the hotel name");
      String hotelname = searchHotelSnr.nextLine();
      for(Hotel hotel : hotelList){
          if(hotel.getHotelName().equals(hotelname)){
             customerDisplay.displaySelectedHotel(hotel);
             selectedHotel = hotel;
          }
      }
        return selectedHotel;
    }

    @Override
    public void displayHotels() {
      customerDisplay.displayHotels(hotelList);
    }

    @Override
    public void searchHotel() {
         Scanner searchHotelSnr = new Scanner(System.in);
      System.out.println("Enter the hotel name");
      String hotelname = searchHotelSnr.nextLine();
      for(Hotel hotel : hotelList){
          if(hotel.getHotelName().equals(hotelname)){
             customerDisplay.displaySelectedHotel(hotel);
             break;
          }
      }
        System.out.println("No hotels found!!!");
    }
    
    
    public Hotel askOption(){
        displayHotels();
        int option = customerDisplay.showMainPageDisplay();
        switch(option){
            case 1:
                searchHotel();
                askOption();
                break;
            case 2:
                Hotel hotel = selectHotel();
               return hotel;    
        }
        return null;
    }
    
}
