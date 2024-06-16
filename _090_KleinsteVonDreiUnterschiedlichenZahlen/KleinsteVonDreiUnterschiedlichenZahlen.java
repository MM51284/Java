/*
 * Kleinste von drei UNTERSCHIEDLICHEN Zahlen
 *
 * Schreibe ein Programm,
 * das drei Variablen mit zufälligen,
 * UNTERSCHIEDLICHEN Zahlen (aus dem gleichen Zahlenraum) befüllt.
 * Dann soll das Programm testen,
 * welche der Zahlen die Kleinste ist und diese ausgeben.
 */
package _090_KleinsteVonDreiUnterschiedlichenZahlen;

import java.util.Random;

public class KleinsteVonDreiUnterschiedlichenZahlen {

    public static void main(String[] args) {
        // Drei unterschiedliche Zahlen generieren
        Random r = new Random();
        int a = r.nextInt(10);
        int b = r.nextInt(10);
        int c = r.nextInt(10);
        // Sicher stellen, dass keine der drei Zahlen doppelt vorkommt
        while (a == b || b == c || c == a) {
            // a = r.nextInt(10); // muss nicht nochmals neu generiert/gezogen werden
            b = r.nextInt(10);
            c = r.nextInt(10);
        }
        // Ausgabe der drei Zufallszahlen
        System.out.println(a + ", " + b + ", " + c);
        // Prüfen, welche der Zahlen die kleinste ist und entsprechende Ausgabe
        int d;
        if (a < b && a < c) {
            d = a;
        } else if (b < a && b < c) {
            d = b;
        } else {
            d = c;
        }
        System.out.println("Die kleinste Zahl ist: " + d);
    }
}
