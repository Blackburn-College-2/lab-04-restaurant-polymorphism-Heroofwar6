/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Orderable;
import edu.blackburn.cs.cs212.restaurantbase.Receipt;
import java.util.ArrayList;

/**
 *
 * @author cameron.shinall
 */
public class Meat implements Orderable {
    Receipt receipt = new Receipt();
    String flavor;
    Money price;
    /**
     * 
     * @param flavor the flavor of the meat
     * @param price the price of the meat
     */
    public Meat(String flavor, Money price){
        this.flavor = flavor;
        this.price = price;
    }
    /**
     * 
     * @return the price of the meat
     */
    @Override
    public Money getPrice() {
        return this.price;
    }
    /**
     * 
     * @return the item on the receipt
     */
    @Override
    public String getReceiptItem() {
        return this.flavor + "\t" + this.getPrice();
    }
    /**
     * 
     * @return the flavor of the meat 
     */
    @Override
    public String toString(){
        return this.flavor;
    }
}

