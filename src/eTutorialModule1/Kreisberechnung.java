package eTutorialModule1;

import java.util.Scanner;

public class Kreisberechnung {
    public static void main(String[] args) {
        final double PI = 3.14159265359;
        double radius;
        double flaeche;
        double umfang;

        Scanner scan = new Scanner (System.in);
        System.out.println("Geben Sie den Radius ihres Kreises ein");
        radius = scan.nextDouble();

        flaeche = PI * (radius * radius);
        flaeche = Math.round(flaeche*100)/100.0;

        umfang = (2 * radius) * PI;
        umfang = Math.round(umfang*100)/100.0;

        System.out.println("Radius: " + radius);
        System.out.println("Flaeche: " + flaeche);
        System.out.println("Umfang: " + umfang);



    }
}
