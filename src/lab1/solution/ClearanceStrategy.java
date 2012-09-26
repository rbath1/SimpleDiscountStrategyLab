/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.solution;

/**
 *
 * @author rbath1
 */
public class ClearanceStrategy implements DiscountStrategy {
    private static final double DISC = .5;
    @Override
    public double getDiscountInDollars(double price){
        //50% off
           return price * DISC;
    }
}
