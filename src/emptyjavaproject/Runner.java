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
        Size size = new Size("name");
        Coffee coffee = new Coffee(size.getName(), size, money);
        receipt.add(coffee);
        receipt.add(coffee);
        receipt.add(coffee);
        receipt.add(coffee);
        receipt.add(coffee);
        System.out.println(receipt.prepare());
    }
    
}
