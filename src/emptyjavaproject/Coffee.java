/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import edu.blackburn.cs.cs212.restaurantbase.MenuItem;
import edu.blackburn.cs.cs212.restaurantbase.Money;

/**
 *
 * @author cameron.shinall
 */
public class Coffee extends MenuItem{
    
    public Coffee(String name, Size size, Money price){
        name = size.getName();
    }
    @Override
    public String toString(){
        return this.toString();
    }

    @Override
    public Money getPrice() {
        return this.getPrice();
    }

    @Override
    public String getReceiptItem() {
        return this.getReceiptItem();
    }
}
