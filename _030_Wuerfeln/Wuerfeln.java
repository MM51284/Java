/*
 * Würfeln
 *
 * Würfel eine Zahl (von 1 bis 6) und gib aus,
 * was gewürfelt wurde:
 * Super, eine 6!
 * Immerhin noch eine 5!
 * Das reicht nicht! (bei 1-4)
 */

package _030_Wuerfeln;

import java.util.Random;

public class Wuerfeln {

    public static void main(String[] args) {
        // Zufällige Zahl zwischen 1 und 6 würfeln
        Random number = new Random();
        int wuerfeln = number.nextInt(1, 7);

        // Ausgeben der zufällig generierten Zahl
        if (wuerfeln == 6) {
            System.out.println("Super, eine 6!");
        } else if (wuerfeln == 5) {
            System.out.println("Immerhin noch eine 5!");
        } else {
            System.out.println("Leider nur eine " + wuerfeln + ". Das reicht nicht!");
        }
    }
}
