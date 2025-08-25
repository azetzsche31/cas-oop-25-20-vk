package eTutorialModule1;

import java.util.Scanner;

public class Noten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double summe = 0;
        int anzahl = 0;
        double note;

        System.out.println("Geben Sie ihre Noten ein. (0 für Eingabe beenden.)");

        while(true) {
            System.out.print((anzahl + 1) + ". Note: ");
            note = scanner.nextDouble();

            if (note == 0) {
                break;
            }

            summe += note;
            anzahl++;
        }

        if (anzahl > 0) {
            double durchschnitt = summe / anzahl;
            System.out.printf("Sie haben %d Noten eingegeben. Schnitt = %.2f%n", anzahl, durchschnitt);
        } else {
            System.out.println("Keine Noten eingegeben.");
        }

        scanner.close();


    }
}
