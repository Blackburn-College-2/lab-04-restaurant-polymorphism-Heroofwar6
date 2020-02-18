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
    private Size size;
    public Coffee(String name, Size size, Money price){
        super(name,price);
        this.size = size;
    }
    
    @Override
    public String toString(){
        return this.toString();
    }

    @Override
    public Money getPrice() {
        return this.getBasePrice();
    }

    @Override
    public String getReceiptItem() {
        return this.getName() + "\t" + this.getPrice() + "\t" 
                + this.size.name + "\n";
    }

}
