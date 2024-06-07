package Kopfrechnen;

import java.util.Random;
import java.util.Scanner;

public class KopfrechnenApp {

    public static void main(String[] args) {

        // Zufallszahl sowie Scanner für die Eingabe der Ergebnisse instanziieren
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        // Zähler für richtige Antworten initialisieren
        int countCorrectAnswers = 0;
        // Gesamtzahl der zu erstellenden Aufgaben
        int calcTotal = 5;
        // Startzeit setzen
        long start = System.currentTimeMillis();

        // Zufällige Aufgaben generieren
        for (int i = 1; i <= calcTotal; i++) {
            char operator = getRandomOperator(random);
            int num1 = random.nextInt(100);
            int num2 = random.nextInt(100);
            ;

            if (operator == '+' || operator == '*') {
                num2 = random.nextInt(100); // generiere zweite Zahl von 0 bis 99
            } else if (operator == '-' || operator == '%') {
                num2 = random.nextInt(num1 + 1); // 2. Zahl generieren, die  num2 <= num1
            } else if (operator == '/') {
                // num2 = random.nextInt(99) + 1; // num2 ist garantiert größer oder gleich num1
                while (num1 % num2 != 0) { // Solange num1 nicht durch num2 teilbar ist
                    num2 = random.nextInt(99) + 1; // Generiere neue Zahl für num2 > 0
                }
            }

            int result = calcResult(num1, num2, operator);
            System.out.print(i + ". Aufgabe: " + num1 + " " + operator + " " + num2 + " = ");
            int answer = input.nextInt();
            // Vergleichen, ob Eingabe mit Ergebnis übereinstimmt und Zählen der korrekten Antworten
            if (answer == result) {
                countCorrectAnswers++;
                System.out.println("Richtig!");
            } else {
                System.out.println("Falsch! Das richtige Ergebnis lautet: " + result);
            }
        }
        // Endzeit setzen und Dauer in Millisekunden berechnen
        long end = System.currentTimeMillis();
        long duration = end - start;
        String formatDuration = formatMillis(duration);

        // Ausgabe der Ergebnisse
        System.out.println("Sie haben " + countCorrectAnswers + " von 5 Aufgaben innerhalb von " + duration + " ms korrekt beantwortet." +
                "\nDies entspricht einer Zeit von: " + formatDuration);

    }

    // Generieren der zufälligen Operatoren
    private static char getRandomOperator(Random random) {
        char[] operators = {'+', '-', '*', '/', '%'};
        return operators[random.nextInt(operators.length)];
    }

    // Formatierung der Zeit in Minuten und Sekunden
    public static String formatMillis(long milliseconds) {
        long minutes = milliseconds / 60000; // 1 Minute = 60000 Millisekunden
        long remainingMillis = milliseconds % 60000; // restliche Millisekunden
        long seconds = remainingMillis / 1000; // 1 Sekunde = 1000 Millisekunden
        long millisecs = remainingMillis % 1000; // übrige Millisekunden

        return String.format(minutes + " Min. : " + seconds + " Sek. : " + millisecs + " Millisek.");
    }

    // Berechnung der Ergebnisse
    private static int calcResult(int num1, int num2, char operator) {
        if (operator == '+') {
            return num1 + num2;
        } else if (operator == '-') {
            return num1 - num2;
        } else if (operator == '*') {
            return num1 * num2;
        } else if (operator == '/') {
            return num1 / num2;
        } else {
            return num1 % num2;
        }

    }
}
