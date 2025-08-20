package eTutorialModule1;

import java.util.Scanner;

public class Doppeln {
    public static void main(String[] args) {
        double zahl;

        Scanner scanner = new Scanner (System.in);
        System.out.println("Geben Sie ihre Zahl ein");
        zahl = scanner.nextDouble();
        zahl = zahl * 2;
        System.out.println("Wenn ich Ihre Zahl verdopple erhalten wir den Wert: " + zahl);

    }
}
