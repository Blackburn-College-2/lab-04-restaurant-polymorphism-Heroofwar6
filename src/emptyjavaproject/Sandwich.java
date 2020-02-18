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
    ArrayList<Orderable> contents = new ArrayList<Orderable>();
            
    @Override
    public Money getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getReceiptItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
