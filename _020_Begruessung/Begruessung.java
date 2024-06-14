/*
 * Begrüßung
 *
 * Es soll eine Begrüssung in Abhängingkeit zur Uhrzeit
 * ausgegeben werden.
 * Zwischen 22Uhr und 5Uhr: Gute Nacht
 * Vor 11Uhr: Guten Morgen
 * Vor 15Uhr: Mahlzeit
 * Vor 18Uhr: Guten Nachmittag
 * Vor 22Uhr: Guten Abend
 *
 * Erstelle die Stunde per Zufall zwischen 0 - 23.
 */

package _020_Begruessung;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Begruessung {

    public static void main(String[] args) {
        // Stunde zwischen 0 und 23 erstellen
        Random number = new Random();
        int uhrzeit = number.nextInt(24);

        // Bedingungen setzen und Ausgeben
        if (uhrzeit <= 5) { // zwischen 0 und 5
            System.out.println("Es ist " + uhrzeit + " Uhr: Gute Nacht!");
        } else if (uhrzeit < 11) { // unter 11
            System.out.println("Es ist " + uhrzeit + " Uhr: Guten Morgen!");
        } else if (uhrzeit < 15) { // unter 15
            System.out.println("Es ist " + uhrzeit + " Uhr: Mahlzeit!");
        } else if (uhrzeit < 18) { // unter 18
            System.out.println("Es ist " + uhrzeit + " Uhr: Guten Nachmittag!");
        } else if (uhrzeit < 22) { // unter 22
            System.out.println("Es ist " + uhrzeit + " Uhr: Guten Abend!");
        } else {                   // 22 und 23
            System.out.println("Es ist " + uhrzeit + " Uhr: Gute Nacht!");
        }


    }
}
