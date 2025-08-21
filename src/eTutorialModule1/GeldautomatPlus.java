package eTutorialModule1;

import java.util.Scanner;

public class GeldautomatPlus {
    public static void main(String[] args) {

        int betrag;
        final int maxBetrag = 3000;
        int antwort;



        Scanner scanner = new Scanner(System.in);
        System.out.println("WILLKOMMEN BEI DER BANK IHRES VERTRAUENS");
        System.out.println("****************************************");
        System.out.println("Welchen Betrag möchten Sie abheben?");
        betrag = scanner.nextInt();

        System.out.println("Eingegebener Geldbetrag: " + betrag + " Fr.");

        if(betrag % 10 != 0){
            betrag = (int) Math.floor(betrag / 10.0) * 10;
        }

        if(betrag > maxBetrag ){
            System.out.println("Der gewünschte Betrag ist grösser als der maximal Betrag von " + maxBetrag + " Fr.");
            System.out.println("Möchten Sie den maximal Betrag abheben? Ja = 1, Nein = 2");

            antwort = scanner.nextInt();

            if (antwort == 1) {
                System.out.println("Sie haben Ja gewählt. Wir zahlen Ihnen den Betrag von " + maxBetrag + " Fr. aus");
                betrag = maxBetrag;
                berechnung(betrag);
            }
            System.out.println("Sie haben Nein gewählt. Wir brechen die Auszahlung ab.");
        } else {

            System.out.println("Wir geben Ihnen den Betrag von " + betrag + " in nachfolgendne Noten aus.");
            berechnung(betrag);
        }





    }

    private static void berechnung(int betrag) {

        int hundert;
        int rest;
        int fuenfzig;
        int zwanzig;
        int zehn;

        hundert = betrag/100;
        rest = betrag%100;
        fuenfzig = rest/50;
        rest = rest%50;
        zwanzig = rest/20;
        rest = rest%20;
        zehn = rest/10;
        rest = rest%10;

        if(hundert != 0) {
            System.out.println("100er " + hundert);
        }
        if(fuenfzig != 0) {
            System.out.println("50er: " + fuenfzig);
        }
        if(zwanzig != 0) {
            System.out.println("20er: " + zwanzig);
        }
        if(zehn != 0) {
            System.out.println("10er: " + zehn);
        }
        if(rest != 0) {
            System.out.println("Rest: " + rest);
        }
    }
}
