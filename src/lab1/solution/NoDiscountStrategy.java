/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.solution;

/**
 *
 * @author rbath1
 */
public class NoDiscountStrategy implements DiscountStrategy {
   private final double discount = 1.0;
    @Override 
    public double getDiscountInDollars(double price){
        return price * discount;
    }
    
    
}
