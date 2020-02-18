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
public class FancyCoffee extends Coffee {
    ArrayList<Orderable> addOn = new ArrayList<>();
    public FancyCoffee(String name, Size size, Money basePrice){
        super(name, size, basePrice);
    }
    public Orderable add(){
        
    }
}
