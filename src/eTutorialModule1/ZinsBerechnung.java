package eTutorialModule1;

import java.util.Scanner;

public class ZinsBerechnung {
    public static void main(String[] args) {
        double kontostand;
        double zins;
        double zinsWert;
        int jahre;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie nachfolgend die Parameter ein: Kontostand, Zins, Anzahl Jahre");
        System.out.println("Jede Eingabe mit Enter bestätigen.");

        kontostand = scanner.nextDouble();
        zins = scanner.nextDouble();
        jahre = scanner.nextInt();

        zins = zins / 100;

        for (int i = 1; i <= jahre; i++) {
            zinsWert = kontostand * zins;
            zinsWert = Math.round(zinsWert);
            kontostand = kontostand + zinsWert;
            System.out.println("Im " + i + ". Jahr gibt es " + zinsWert + " Fr. Zins. Neuer Kontostand: " + kontostand + " Fr.");
        }



    }
}
