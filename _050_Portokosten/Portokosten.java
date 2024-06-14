/*
 * Portokosten
 *
 * Die Portokosten sind wie folgt festgelegt:
 *  0 - 39.99€ Bestellwert kosten 3.99€ Porto
 * 40 - 69.99€ Bestellwert kosten 2.99€ Porto
 * 70 - 99.99€ Bestellwert kosten 1.99€ Porto
 * ab 100€ ist portofrei
 *
 * Es soll eine Zufallszahl (bestellwert)
 * von 0.01 - 130.00 erzeugt werden (z.B. 40.47, 123.78)
 * Dann soll ermittelt werden,
 * wie hoch die entsprechenden Portokosten sind.
 * Am Ende sollen der Bestellwert,
 * die Portokosten und der Gesamtbetrag
 * ausgegeben werden:
 * "Bei einem Bestellwert von 67,54 € betragen die
 *  Portokosten 2,99 €. Der Gesamtbetrag beträgt somit 70,53 €."
 */

package _050_Portokosten;

import java.text.DecimalFormat;
import java.util.Currency;
import java.util.Random;

public class Portokosten {

    public static void main(String[] args) {

        // Zufallszahl zwischen 0.01 und 130.00 generieren
        Random rand = new Random();
        double bestellwert = rand.nextDouble(0.01, 131.01);
        // Formatierung der generierten Zahl auf 2 Nachkommastellen und Ausgabe des Bestellwerts
        DecimalFormat euro = new DecimalFormat("0.00 €");
        System.out.println("Bestellwert: " + euro.format(bestellwert));

        // Setzen der Werte und formatierte Ausgabe der Portokosten
        double porto;
        if (bestellwert < 40) {
            porto = 3.99;
        } else if (bestellwert < 70) {
            porto = 2.99;
        } else if (bestellwert < 100) {
            porto = 1.99;
        } else {
            porto = 0;
        }
        System.out.println("Portokosten: " + euro.format(porto));

        // Berechnen der Gesamtkosten und formatierte Ausgabe
        double gesamt = bestellwert + porto;
        System.out.println("Gesamtkosten: " + euro.format(gesamt));

    }
}
