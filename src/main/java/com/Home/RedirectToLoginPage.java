package com.Home;


import com.Customer.Customer;
import com.Customer.CustomerFunctionality;
import com.DeliveryBoy.DeliveryBoy;
import com.DeliveryBoy.DeliveryBoyFunctionality;
import com.Hotel.Hotel;
import com.Hotel.HotelFunctionality;
import com.HotelAdmin.HotelAdminFunctionality;
import com.mainPage.CustomerMainPageFunctionality;
import com.mainPage.CustomerMainpage;
import com.order.Orders;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class RedirectToLoginPage {
    CustomerMainpage mainpage;
    ArrayList<Customer> customerList;
    Customer customer = null;
    HomePageDisplay homepageDisplay;
    ArrayList<Orders> deliveryOrderlist;
    public RedirectToLoginPage(CustomerMainpage mainpage, ArrayList<Customer> customerList, ArrayList<Orders> deliveryOrderList) {
        this.homepageDisplay = new HomePageDisplay();
        this.mainpage = mainpage;
        this.customerList = customerList;
        this.deliveryOrderlist = deliveryOrderList;
    }
     @SuppressWarnings("empty-statement")
     public void callMenu(){
        while (showHomePageMenu());
    }
     
     public boolean showHomePageMenu(){
         Scanner showMenuSnr = new Scanner(System.in);
         int option = homepageDisplay.showHomePageMenu();
         
         switch(option){
             case 1:
                int optionForLogin = homepageDisplay.askOptionForLogin();
                switch(optionForLogin){
                    case 1:
                        String name = homepageDisplay.customerLogin();
                        for(Customer cus : customerList){
                            if(cus.getName().equals(name)){
                                customer = cus;
                                break;
                            }
                        }
                        if(customer == null){
                            System.out.println("No user found please login!!!");
                            return false;
                        }
                       break;
                    case 2:
                      customer = homepageDisplay.customerSignin();
                      customerList.add(customer);
                      break;
                       }
                 CustomerMainPageFunctionality customerMainpage = new CustomerMainPageFunctionality(mainpage.getHotelList());
                 Hotel selectedHotel = customerMainpage.askOption();
                 HotelFunctionality hotelFunc = new HotelFunctionality(selectedHotel);
                 CustomerFunctionality customerFunc = new CustomerFunctionality(customer, hotelFunc, deliveryOrderlist);
                 customerFunc.showFeatures();
               
                break;
             case 2:
                 int opt = homepageDisplay.askOptionForLogin();
                 switch(opt){
                     case 1:
                         System.out.println("Enter the hotel name to login");
                         String hotelname = showMenuSnr.nextLine();
                         Iterator itr = mainpage.getHotelList().iterator();
                         while(itr.hasNext()){
                             Hotel hotel = (Hotel) itr.next();
                             if(hotel.getHotelName().equals(hotelname)){
                                 HotelAdminFunctionality hotelAdminFunc = new HotelAdminFunctionality(hotel);
                                 hotelAdminFunc.Showfeatures();
                             }  
                         }
                     break;
                     case 2:
                        Hotel newHotel = homepageDisplay.createHotel();
                        mainpage.getHotelList().add(newHotel);
                           HotelAdminFunctionality hotelAdminFunc = new HotelAdminFunctionality(newHotel);
                           hotelAdminFunc.Showfeatures();
                         break;
                         
                 }
               break;
             case 3:
                 DeliveryBoy deliveryBoy = new DeliveryBoy(deliveryOrderlist);
                 DeliveryBoyFunctionality deliveryBoyFunc = new DeliveryBoyFunctionality(deliveryBoy);
                 deliveryBoyFunc.showFeatures();
              break;
             case 4:
                 return false;
              
         }
         return true;
     }
}

