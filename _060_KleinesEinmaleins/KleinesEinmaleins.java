/*
 * Kleines Einmaleins
 *
 * Schreibe ein Programm,
 * das das kleine Einmaleins formatiert ausgibt:
 *
 * 001 002 003 004 005 006 007 008 009 010
 * 002 004 006 008 010 012 014 016 018 020
 * 003 006 009 012 015 018 021 024 027 030
 * 004 008 012 016 020 024 028 032 036 040
 * 005 010 015 020 025 030 035 040 045 050
 * 006 012 018 024 030 036 042 048 054 060
 * 007 014 021 028 035 042 049 056 063 070
 * 008 016 024 032 040 048 056 064 072 080
 * 009 018 027 036 045 054 063 072 081 090
 * 010 020 030 040 050 060 070 080 090 100
 */

package _060_KleinesEinmaleins;

import java.text.DecimalFormat;

public class KleinesEinmaleins {

    public static void main(String[] args) {

        // Formatieren der Ausgabe mit führenden Nullen
        DecimalFormat nullen = new DecimalFormat("000");
        // Äußere Schleife von 1 bis 10 iterieren
        for(int i = 1; i <= 10; i++) {
            if(i > 1) {
            System.out.println();} // Zeilenumbruch ab zweiter Zeile
            // Innere Schleife von 1 bis 10 iterieren
            for (int j = 1; j <= 10; j++)
                // Ausgeben der Produkte
                System.out.print(nullen.format(i * j) + " ");
        }
    }
}
