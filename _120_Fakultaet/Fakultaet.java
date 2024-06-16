 /*
  * Fakultät
  *
  * Schreibe ein Programm,
  * das ermittelt, welche Zahl möglichst groß ist
  * ohne dass ihre Fakultät über 1.000.000.000 ist.
  *
  * Gib zum Beweiß auch alle kleineren Fakultäten aus.
  *
  * Hinweis:
  * Fakultät von 5 (Kurzschreibweise: 5!):
  * 1 * 2 * 3 * 4 * 5 = 120
  */

package _120_Fakultaet;

public class Fakultaet {

    public static void main(String[] args) {
        // Initialisieren der Variablen
        int num = 0;
        long fak = 1, max = 1_000_000_000L;
        // Aufaddieren der Zahlen und Berechnen der Fakultäten bis max
        while (fak < max) {
            num++;
            fak *= num;
        } // Ausgabe
        System.out.println("Die möglichst große Zahl, deren Fakultät " + max +
                " nicht überschreitet ist somit: " + (num - 1) + " mit einem Produkt von: " + (fak / num));

        // Ausgabe der einzelnen Fakultäten
        System.out.println("Die Fakultäten der Zahlen bis " + (num - 1) + " sind: ");
        long fak2 = 1;
        for (int i = 0; i < num; i++) {
            System.out.println(i + "! = " + fak2);
            fak2 *= (i + 1);
        }
    }
}
