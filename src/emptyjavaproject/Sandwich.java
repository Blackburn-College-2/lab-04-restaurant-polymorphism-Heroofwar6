/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Orderable;
import java.util.ArrayList;

/**
 *
 * @author cameron.shinall
 */
public class Sandwich implements Orderable{
    Money basePrice;
    Size size;
    String name;
    ArrayList<Orderable> addOn = new ArrayList<>();
    /**
     * 
     * @param name the name of the sandwich
     * @param size the size of the sandwich
     * @param basePrice the base price of the sandwich
     */
    public Sandwich(String name, Size size, Money basePrice) {
        this.basePrice = basePrice;
        this.size = size;
        this.name = name;
    }
    /**
     * 
     * @param orderable an extra part of the sandwich
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
     * @return the base price of the sandwich
     */
    @Override
    public Money getPrice() {
        return this.basePrice;
    }
}
