/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import edu.blackburn.cs.cs212.restaurantbase.Measurement;

/**
 *
 * @author cameron.shinall
 */
public class Size extends Measurement {
    String name;
    /**
     * 
     * @param name the name of the size of the ordered item
     */
    public Size(String name){
        this.name = name;
    }
    /**
     * 
     * @return name of the size
     */
    public String getName() {
        return name;
    }
    /**
     * 
     * @return a string of the size
     */
    @Override
    public String toString(){
        return this.toString();
    }
}
