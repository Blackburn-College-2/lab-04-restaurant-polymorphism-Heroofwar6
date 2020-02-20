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
public class FancyCoffee extends Coffee {
    Money basePrice;
    Size size;
    String name;
    ArrayList<Orderable> addOn = new ArrayList<>();
    /**
     * 
     * @param name the name of the coffee
     * @param size the size of the coffee
     * @param basePrice the base price of the coffee
     */
    public FancyCoffee(String name, Size size, Money basePrice) {
        super(name, size, basePrice);
        this.basePrice = basePrice;
        this.size = size;
        this.name = name;
    }
    /**
     * 
     * @param orderable an extra part of the coffee
     */
    public void add(Orderable orderable) {
        this.basePrice = this.basePrice.add(orderable.getPrice());
        addOn.add(orderable);
    }
    /**
     * 
     * @return the item on the receipt
     */
    @Override
    public String getReceiptItem() {
        String print = this.size.name +" "+ this.name + "\t"
               + this.basePrice.toString() + "\t"
                + "\n";
        for (int i = 0; i < addOn.size(); i++) {
            print += addOn.get(i).getReceiptItem() + "\n";
        }
        return print;
    }
    /**
     * 
     * @return the base price of the coffee
     */
    @Override
    public Money getPrice() {
        return this.basePrice;
    }
}
