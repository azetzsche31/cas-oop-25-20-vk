package eTutorialModule1;

import java.util.Scanner;

public class Pin_while {

	public static void main(String[] args) {
        int a, b, c;
        boolean zustand = false;
        int versuche = 3;

        Scanner scanner = new Scanner(System.in);
        while(!zustand && versuche != 0) {

            System.out.println("Bitte geben sie den 3 stelligen Pin ein!");
            System.out.print("1. Ziffer: ");
            a = scanner.nextInt();
            System.out.print("2. Ziffer: ");
            b = scanner.nextInt();
            System.out.print("3. Ziffer: ");
            c = scanner.nextInt();
            System.out.println("Sie haben eingegeben: " + a + b + c);

            if (a == 0 && b == 0 && c == 7) {
                System.out.println("Offen");
                zustand = true;
            } else {
                System.out.println("Falscher Pin");
            }
            versuche--;
            System.out.println("Sie haben noch " + versuche + " versuche!");

        }
    }
}