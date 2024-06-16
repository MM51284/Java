/*
 * Fibonacci
 *
 * Schreibe ein Programm, das die ersten 10 Zahlen der
 * Fibonacci-Folge ausgibt: 0 1 1 2 3 5 8 13 21 34
 *
 * Die ersten beiden Zahlen dürfen hardcodiert ausgegeben werden.
 *
 * Die Fibonacci-Folge beginnt mit 0 und 1.
 * Ab dann entsteht die folgende Zahl
 * indem man jeweils die beiden vorherigen Zahlen addiert.
 *
 * Zusatz: Gib alle Zahlen unter 500 aus
 */
package _070_Fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        // Angeben, wie viele Zahlen berechnet werden sollen
        int gesamt = 10;
        // Die ersten beiden Zahlen der Folge 'hardcodiert' setzen und ausgeben
        int x = 0, y = 1;
        System.out.print(x + " " + y + " ");
        // Ab der 3. Zahl bis 'gesamt' berechnen und ausgeben
        for (int i = 2; i < gesamt; i++) {
            int z = x + y;
            System.out.print(z + " ");
            x = y; // für x den Wert von vorherigem y übernehemen
            y = z; // für y den nächsten Wert (x + y) übernehmen
        }
    }
}
