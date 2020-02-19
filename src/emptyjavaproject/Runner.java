/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Receipt;


/**
 *
 * @author paul.kline
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Receipt receipt = new Receipt();
        Money money = new Money(2.00);
        Money sPrice = new Money(0.50);
        Size large = new Size("large");
        Size small = new Size("small");
        Size medium = new Size("medium");
        Syrup chocolate = new Syrup("Chocolate", sPrice);
        Syrup cherry = new Syrup("Cherry", sPrice);
        Coffee latte = new Coffee("latte", large, money);
        Coffee capuccino = new Coffee("capuccino", small, money);
        Coffee expresso = new Coffee("expresso", medium, money);
        FancyCoffee fCoffee = new FancyCoffee("Capuccino", medium, money);
        receipt.add(latte);
        receipt.add(capuccino);
        receipt.add(expresso);
        receipt.add(latte);
        receipt.add(capuccino);
        receipt.add(fCoffee);
        System.out.println(receipt.prepare());
    }
    
}
