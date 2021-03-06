package lab1.solution;


import java.text.NumberFormat;

/**
 *
 * @author jlombardo
 */
public class Startup {
    public static void main(String[] args) {
        Product[] products = {
            new BaseballHat("Brewers Baseball Hat", "BH100",19.95),
            new LeatherBelt("Men's Leather Dress Belt", "LB201", 39.50),
            new Socks("Women's Cotton Socks (Large)", "WS45", 25.88)
        };
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        for(Product p : products) {
            p.setDiscountStrategy(new ClearanceStrategy());
            System.out.println(p.getPartNumber() + ", "
                    + p.getPartName() + ", Price: "
                    + nf.format(p.getPrice()) + ", Discount Price: "
                    + nf.format(p.getDiscountStrategy().getDiscountInDollars(p.getPrice())));
        }
    }
}
