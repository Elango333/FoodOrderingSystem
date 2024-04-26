
package com.DeliveryBoy;

import com.order.Orders;


public class DeliveryBoyFunctionality implements DeliveryBoyFuncInterface{

    private DeliveryBoy deliveryBoy;

    public DeliveryBoyFunctionality(DeliveryBoy deliveryBoy) {
        this.deliveryBoy = deliveryBoy;
    }
    
    DeliveryBoyDisplay deliveryBoyDisplay = new DeliveryBoyDisplay();
    
    @Override
    public void deliverFoodToCustomer() {
        for(Orders order : deliveryBoy.getOrderList()){
            deliveryBoyDisplay.deliverFoods(order);
        }
    }
    
    
    public void showFeatures(){
        int option = deliveryBoyDisplay.showfeatures();
        switch(option){
            case 1:
                deliverFoodToCustomer();
                break;
            case 2:
                break;
        }
    }
    
}
