package eTutorialModule1;

import java.util.Scanner;

public class Geldautomat {
    public static void main(String[] args) {

        int betrag;
        int hundert;
        int fuenfzig;
        int zwanzig;
        int zehn;
        int rest;

        Scanner scanner = new Scanner(System.in);
        System.out.println("WILLKOMMEN BEI DER BANK IHRES VERTRAUENS");
        System.out.println("****************************************");
        System.out.println("Welchen Betrag möchten Sie abheben?");
        betrag = scanner.nextInt();

        System.out.println("Eingegebener Geldbetrag: " + betrag + " Fr.");

        hundert = betrag/100;
        rest = betrag%100;
        fuenfzig = rest/50;
        rest = rest%50;
        zwanzig = rest/20;
        rest = rest%20;
        zehn = rest/10;
        rest = rest%10;

        System.out.println("100er " + hundert);
        System.out.println("50er: " + fuenfzig);
        System.out.println("20er: " + zwanzig);
        System.out.println("10er: " + zehn);
        System.out.println("Rest: " + rest);

    }
}
