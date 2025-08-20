package eTutorialModule1;

import java.util.Scanner;

public class Bremsweg {
    public static void main(String[] args) {

        double geschwindigkeit;
        double reaktionsweg;
        double bremsweg;
        double anhalteweg;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie die Geschwindigkeit ein.");

        geschwindigkeit = scanner.nextDouble();

        reaktionsweg = 3 * (geschwindigkeit/10);
        bremsweg = (geschwindigkeit/10) * (geschwindigkeit/10);
        anhalteweg = reaktionsweg + bremsweg;

        System.out.println("Der Anhalteweg beträgt: " + anhalteweg + " Meter");

    }
}
