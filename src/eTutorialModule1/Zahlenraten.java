package eTutorialModule1;

import java.util.Random;
import java.util.Scanner;

public class Zahlenraten {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int anzahl = 0;
        int gesuchteZahl = 0;
        int gerateneZahl = 0;

        Random random = new Random();
        gesuchteZahl = random.nextInt(100) + 1;

        System.out.println("Gesucht ist eine Zahl zwischen 1 und 100");



        while(gesuchteZahl != gerateneZahl) {
            System.out.println("raten Sie!");
            gerateneZahl = scanner.nextInt();
            if(gesuchteZahl < gerateneZahl) {
                System.out.println("zu gross");
                anzahl++;
            } else if(gesuchteZahl > gerateneZahl) {
                System.out.println("zu klein");
                anzahl++;
            } else {
                System.out.println("Erraten! " + anzahl + " mal geraten.");
            }
        }

    }
}
