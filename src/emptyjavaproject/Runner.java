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
        Money money = new Money(1.00);
        Money sPrice = new Money(0.50);
        Size large = new Size("Large");
        Size small = new Size("Small");
        Size medium = new Size("Medium");
        Syrup chocolate = new Syrup("Chocolate", sPrice);
        Syrup cherry = new Syrup("Cherry", sPrice);
        Topping top = new Topping("Tomato", sPrice);
        Meat meat = new Meat("Ham", sPrice);
        Meat meet = new Meat("Bacon", sPrice);
        Coffee expresso = new Coffee("Black Coffee", medium, money);
        FancyCoffee fCoffee = new FancyCoffee("Capuccino", medium, money);
        Sandwich sandwich = new Sandwich("Sandwich", medium, money);
        sandwich.add(top);
        sandwich.add(meat);
        sandwich.add(meet);
        fCoffee.add(cherry);
        fCoffee.add(chocolate);
        receipt.add(expresso);
        receipt.add(fCoffee);
        receipt.add(sandwich);
        System.out.println(receipt.prepare());
        System.out.println(receipt.getTotalString());
    }
    
}
