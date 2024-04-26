package com.mainPage;

import com.Hotel.Hotel;
import java.util.ArrayList;

public class CustomerMainpage {
    ArrayList<Hotel> hotelList = new ArrayList<>();

    public ArrayList<Hotel> getHotelList() {
        return hotelList;
    }

    public void setHotelList(ArrayList<Hotel> hotelList) {
        this.hotelList = hotelList;
    }
}
