package com.cursan.homeshop;

public class TakeAwayDelivery implements Delivery {
    @Override
    public double getPrice() {
        return 0;
    }    
        @Override 
        public String getInfo() {
         	return ("Colis emporté par le client");
    }      
 }
