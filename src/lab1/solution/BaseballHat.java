package lab1.solution;



/**
 *
 * @author jlombardo
 */
public class BaseballHat extends Product {
    
    public BaseballHat() {
    }

    public BaseballHat(String partName, String partNumber, double price) {
        this.setPartName(partName);
        this.setPartNumber(partNumber);
        this.setPrice(price);
    }
}
