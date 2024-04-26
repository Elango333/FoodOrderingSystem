package com.Home;

import com.Customer.Customer;
import com.Hotel.Hotel;
import java.util.Scanner;


public class HomePageDisplay {
    
    
  public int showHomePageMenu(){
    Scanner homePageSnr = new Scanner(System.in);
    System.out.println("\n" +
      "╔═══════════════════════════════════╗\n" +
      "║                                   ║\n" +
      "║   Customer login     - Press (1)  ║\n" +
      "║                                   ║\n" +
      "║   HotelAdmin login   - Press (2)  ║\n" +
      "║                                   ║\n" +
      "║   DeliveryBoy login  - Press (3)  ║\n" +
      "║                                   ║\n" +
      "║   Exit               - Press (4)  ║\n" +
      "║                                   ║\n" +
      "╚═══════════════════════════════════╝\n\n");
    int option = homePageSnr.nextInt();
    return option;
  }
  
  public Hotel createHotel(){
      Scanner createHotelSnr = new Scanner(System.in);
      Hotel hotel = new Hotel();
      System.out.println("Enter the hotel name");
      String name = createHotelSnr.nextLine();
      System.out.println("Enter the address");
      String address = createHotelSnr.nextLine();
      hotel.setHotelName(name);
      hotel.setAddress(address);
      return hotel;
  }
  
  
   public int askOptionForLogin(){
    Scanner hotelAdminSnr = new Scanner(System.in);
    System.out.println("\n" +
      "╔═══════════════════════════════════╗\n" +
      "║                                   ║\n" +
      "║   Login              - Press (1)  ║\n" +
      "║                                   ║\n" +
      "║   Signup             - Press (2)  ║\n" +
      "║                                   ║\n" +
      "╚═══════════════════════════════════╝\n\n");
    int option = hotelAdminSnr.nextInt();
    return option;
  }
   
   public Customer customerSignin(){
       Customer customer = new Customer();
       Scanner signinSnr = new Scanner(System.in);
       System.out.println("Enter the name");
       String name = signinSnr.nextLine();
       System.out.println("Enter the mobile number");
       String mobileNumber = signinSnr.nextLine();
       System.out.println("Enter the address");
       String address = signinSnr.nextLine();
       customer.setName(name);
       customer.setMobileNumber(mobileNumber);
       customer.setAddress(address);
       return customer;
   }
   
   public String customerLogin(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the name to login");
       String name = scanner.nextLine();
       return name;
   }
}
