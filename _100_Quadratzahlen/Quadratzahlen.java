/*
 * Quadratzahlen
 *
 * Schreibe ein Programm, das alle Quadratzahlen von natürlichen
 * Zahlen (1, 2, 3, ...) ausgibt, die kleiner als 100 sind.
 * (Die Quadratzahlen sollen kleiner 100 sein!)
 *
 * Zusatz: Gib auch die Anzahl der gefunden Quadratzahlen aus
 */
package _100_Quadratzahlen;

public class Quadratzahlen {

    public static void main(String[] args) {
        // Zähler und maximale Zahl, die eine zu berechnende Quadratzahl haben darf, initialisieren
        int counter = 0;
        int max = 100;
        // Quadratzahlen berechnen und Gesamtzahl der Quadratzahlen unter 'max' zählen und ausgeben
        for (int i = 1; i < max; i++) { // alternativ mit Math.sqrt(max) anstatt der if-Statements
            int q = i * i;
            if (q < max)
                counter++;
            if (q >= max)
                break;
            System.out.println("Die Zahl " + i + " im Quadrat ergibt: " + q);
        }
        System.out.println(counter + " Quadratzahlen unter " + max + " wurden gezählt.");
    }
}
