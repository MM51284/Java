/*
 * Dominosteine
 *
 * Schreibe ein Programm,
 * das alle möglichen Dominosteine in der folgenden Form ausgibt.
 *
 * (0|0)(0|1)(0|2)(0|3)(0|4)(0|5)(0|6)
 *      (1|1)(1|2)(1|3)(1|4)(1|5)(1|6)
 *           (2|2)(2|3)(2|4)(2|5)(2|6)
 *                (3|3)(3|4)(3|5)(3|6)
 *                     (4|4)(4|5)(4|6)
 *                          (5|5)(5|6)
 *                               (6|6)
 */
package _110_Dominosteine;

public class Dominosteine {

    public static void main(String[] args) {
        // Äußere Schleife von 0 bis 6 iterieren
        for (int i = 0; i <= 6; i++) {
            // Für alle j < i Leerzeichen einfügen (erste äußere Iteration 0x, zweite Iteration 1x,...)
            for (int j = 0; j < i; j++) {
                System.out.print("     ");
            } // innere Schleife auch nochmals von 0 bis 6 iterieren
            for (int j = i; j <= 6; j++) {
                System.out.print("(" + i + "|" + j + ")"); // Ausgabe der Werte in entsprechendem Schema
            }
            // nach jeder Iteration der äußeren Schleife eine neue Zeile beginnen
            System.out.println();
        }
    }
}
