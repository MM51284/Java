package _040_Zahlenreihen;

import java.text.DecimalFormat;

public class Zahlenreihen {

    public static void main(String[] args) {

        /* 1.
         * Schreibe eine for-Schleife, die Folgendes ausgibt:
         * 100 90 80 70 60 50 40 30 20 10
         */
        for (int i = 100; i >= 10; i-=10) {
            System.out.print(i + " ");
        }
        System.out.println();

        /* 2.
         * Schreibe eine for-Schleife, die Folgendes ausgibt:
         * 2000 3000 4000 5000 6000
         */
        for (int i = 2000; i <= 6000; i += 1000){
            System.out.print(i + " ");
        }
        System.out.println();

        /* 3.
         * Schreibe eine for-Schleife, die Folgendes ausgibt:
         * 2.0 1.5 1.0 0.5 0.0 -0.5 -1.0
         */
        for (float i = 2.0f; i >= -1.0f; i -= 0.5f){    // alternativ: double i = 2.0; ...
            System.out.print(i + " ");
        }
        System.out.println();

        /* 4.
         * Schreibe eine for-Schleife, die Folgendes ausgibt:
         * 1,0 2,2 3,4 4,6 5,8 7,0 8,2 9,4
         */
        DecimalFormat df = new DecimalFormat("#.0"); // Auf eine Nachkommastelle formatieren
        for (double i = 1.0; i <= 9.4; i += 1.2){
            System.out.print(df.format(i) + " ");
        }
        System.out.println();

        /* 5.
         * Schreibe eine for-Schleife, die Folgendes ausgibt:
         * Z5 Z7 Z9 Z11 Z13
         */
        for (int i = 5; i <= 13; i += 2) {
            System.out.print("Z" + i + " ");
        }
        System.out.println();

        /* 6.
         * Schreibe ein Programm, das per for-Schleife
         * alle Zahlen von 1 bis 20 addiert
         * und danach das Endergebnis ausgibt.
         */
        int sum = 0;
        for (int i = 1; i <=20; i++) {
            sum += i;
        }
        System.out.print("Die Zahlen von 1 bis 20 addiert ergeben: " + sum);
        System.out.println();

        /* 7.
         * Schreibe eine for-Schleife, die Folgendes ausgibt:
         * a2b3 a12b13 a22b23
         */
        int hinten;
        for (int i = 2; i <= 22; i += 10) {
            int j = i + 1;
                    System.out.print("a" + i + "b" + j + " ");
        }
        System.out.println();

        /* 8.
         * Schreibe eine for-Schleife, die Folgendes ausgibt:
         * 13 17 21 29 33 37 45
         */
        for (int i = 13; i <= 45; i +=4) {
            if (i == 25 || i == 41)
                continue;
            System.out.print(i + " ");
        }
        System.out.println();

        /* 9.
         * Schreibe EINE for-Schleife, die Folgendes ausgibt:
         * 1 2 3 4 5 4 3 2 1
         */
        for (int i = 1; i <= 9; i++) {
            if (i <= 5) {
                System.out.print(i + " ");
            } else {
                System.out.print((10 - i) + " ");
            }

        }

    }

}
