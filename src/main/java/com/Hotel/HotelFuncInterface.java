package com.Hotel;

import com.Food.Food;


public interface HotelFuncInterface {
  public Food orderFood(String Foodname);
  public String selectFood();
  public void cancelFood(Food food);
  public String getHotelName();
  public void searchFood();
  public void displayFood();
  public String askOption();
}
