/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import edu.blackburn.cs.cs212.restaurantbase.MenuItem;
import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Receipt;

/**
 *
 * @author cameron.shinall
 */
public class Coffee extends MenuItem{
    Size size;
    /**
     * 
     * @param name the name of the coffee
     * @param size the size of the coffee
     * @param price the base price of the coffee
     */
    public Coffee(String name, Size size, Money price){
        super(name,price);
        this.size = size;
    }
    /**
     * 
     * @return returns the string of this class
     */
    @Override
    public String toString(){
        return this.toString();
    }
    /**
     * 
     * @return the base price of the coffee
     */
    @Override
    public Money getPrice() {
        return this.getBasePrice();
    }
    /**
     * 
     * @return an item on the receipt
     */
    @Override
    public String getReceiptItem() {
        return this.size.name + " " + this.getName() + "\t" 
                + this.getPrice() + "\t" 
                + "\n";
    }
    
}
