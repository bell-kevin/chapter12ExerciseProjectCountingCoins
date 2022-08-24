/** ****************************************************************************
 * CountingCoins.java
 * Programmer: @author Kevin Bell
 * Version: 1.0
 * Course: SDEV 2220
 * Program practices use of enumeration, ternary statements, & for-each loops
 **************************************************************************** */
package countingcoins;

import java.util.*;

public class CountingCoins {

    public static void main(String[] args) {
        Scanner computerKeyboardInput = new Scanner(System.in);
        double total = 0;
        System.out.println("Chapter 12 Coins by Kevin Bell \n");
        //for each loop
        for (CountingCoinsEnum coin : CountingCoinsEnum.values()) { //thank you george
            System.out.print("How many coins are a " + coin + "? ");
            long coinCount = computerKeyboardInput.nextLong();
            total += coinCount * coin.coinValue;
        } // end for-each loop
        System.out.print("How much do you think this pile of coins is worth? $");
        double guess = computerKeyboardInput.nextDouble();
        String ternaryOutput = (guess == total) ? "You are correct" : "You are incorrect";
        System.out.println(ternaryOutput);
        System.out.printf("Total worth of those coins is $%(,.2f \n", total);
    } // end main  
} // end class
