/** ****************************************************************************
 * countingCoinsEnum.java
 * Programmer: @author Kevin Bell
 * Version: 1.0
 * Course: SDEV 2220
 * Program practices use of enumeration, ternary statements, & for-each loops
 **************************************************************************** */
package countingcoins;

public enum CountingCoinsEnum {
    QUARTER(0.25),
    DIME(0.10),
    NICKEL(0.05),
    PENNY(0.01);
    public final double coinValue;

    private CountingCoinsEnum(double coinValue) {
        this.coinValue = coinValue;
    } // end constructor method
} // end CountingCoinsEnum
