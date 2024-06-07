package Validieren;

import java.util.Scanner;

// Eigene Kindklasse von NumberFormatException für leere Eingaben
class LeereEingabeException extends NumberFormatException {
//    LeereEingabeException() {
//        super();
//    }
    LeereEingabeException(String str) {
        super(str);
    }
}

// Eigene Kindklasse von NumberFormatException für Eingaben von Fließkommazahlen
class DoubleEingabeException extends NumberFormatException {
//    DoubleEingabeException() {
//        super();
//    }
    DoubleEingabeException(String str) {
        super(str);
    }
}

// Eigene Kindklasse von NumberFormatException für Eingaben von Buchstaben
class LetterException extends NumberFormatException {
//    LetterException() {
//        super();
//    }
    LetterException(String str) {
        super(str);
    }
}

public class ValidierenApp {

    public static void main(String[] args) {

        // Scanner initialisieren
        Scanner sc = new Scanner(System.in);
        // Boolesche Variable mit 'false' initialisieren
        boolean gueltigeEingabe = false;
        // Double Variable mit Wert '0' initialisieren
        double zahl = 0;

        // While-Schleife zum Prüfen, ob die Eingabe gültig ist
        while (!gueltigeEingabe) {
            // Try-Block zum Testen der Eingabe
            try {
                System.out.print("Bitte geben Sie eine Ganzzahl ein: ");
                String eingabe = sc.nextLine();

                // Prüfen, ob die Eingabe leer ist
                if (eingabe.isEmpty()) {
                    throw new LeereEingabeException("Sie haben nichts eingegeben.");
                }
                // Prüfen, ob die Eingabe 0 ist
                if (eingabe.matches("0+,0+") || eingabe.matches("0+.0+") || eingabe.matches("0+")
                                    || eingabe.matches(".0+") || eingabe.matches(",0+")) {
                    throw new ArithmeticException("Division durch 0 ist nicht möglich."); //
                }
                // Prüfen, ob die Eingabe einen Buchstaben enthält
                if (eingabe.matches(".*[A-z].*")) {
                    throw new LetterException("Keine Buchstaben erlaubt! Bitte geben Sie eine Ganzzahl ein.");
                }
                // Prüfen, ob eine Fließkommezahl mit '.' oder ',' eingegeben wurde
                if (eingabe.contains(",") || eingabe.contains(".")) {
                    throw new DoubleEingabeException("Keine Fließkommazahl erlaubt! Bitte geben Sie eine Ganzzahl ein.");
                }

                // Konvertieren der gültigen Eingabe in die Double Variable 'zahl' zur weiteren Berechnung.
                zahl = Double.parseDouble(eingabe);
                // Schleife beenden
                gueltigeEingabe = true;
            // Catch-Block zum Abfangen der Exceptions
            } catch (DoubleEingabeException de) { // Falls die Eingabe eine Fließkommazahl ist
                System.out.println(de.getMessage());
            } catch (LeereEingabeException lee) { // Falls keine Eingabe vorhanden ist
                System.out.println(lee.getMessage());
            } catch (LetterException le) {  // Falls ein Buchstabe vorhanden ist
                System.out.println(le.getMessage());
            } catch (ArithmeticException ae) {  // Falls die Eingabe 0 ist
                System.out.println(ae.getMessage());
            } catch (NumberFormatException nfe) { // Falls die Eingabe keine Ganzzahl ist
                System.out.println("Dies ist keine Zahl! Bitte erneut versuchen.");
            }
        }

        // Nach gültiger Eingabe: Berechnen und Ausgeben des Ergebnisses
        double ergebnis = 100.0 / zahl;
        System.out.println("100 / " + zahl + " = " + ergebnis);

    }
}
