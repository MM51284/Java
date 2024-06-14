/*
 * Zwei Zahlen genau vergleichen
 *
 * Schreibe ein Programm, das zwei zufällige Zahlen erzeugt
 * Dann soll das Programm testen und ausgeben,
 * welche von den beiden Zahlen größer ist oder ob beide Zahlen gleich groß sind.
 */

package _010_ZweiZahlenGenauVergleichen;

import java.util.Random;

public class ZweiZahlenGenauVergleichen {

    public static void main(String[] args) {

        // Zwei zufällige Zahlen zwischen 0 und 100 erzeugen
        Random number = new Random();
        int num1 = number.nextInt(101);
        int num2 = number.nextInt(101);

        // Die erzeugten Zahlen miteinander vergleichen und ausgeben
        if (num1 > num2) {
            System.out.println("Die erste Zahl (" + num1 + ") ist größer als die zweite Zahl (" + num2 + ").");
        } else if (num1 < num2) {
            System.out.println("Die zweite Zahl (" + num2 + ") ist größer als die erste Zahl (" + num1 + ").");
        } else {
            System.out.println(num1 + " und " + num2 + " sind gleich groß.");
        }

    }
}
