/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.solution;

/**
 *
 * @author rbath1
 */
public class FallSaleStrategy implements DiscountStrategy{
    private static final double DISC = .75;
    @Override
    public double getDiscountInDollars(double price){
        //25% off
        return price * DISC;
    }
}
