package eTutorialModule1;

import java.util.Scanner;

public class Wohnblock {
    public static void main(String[] args) {
        int wohnungen;
        int stockwerke;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie viele Wohnnungen wünschen Sie?");
        wohnungen = scanner.nextInt();

        System.out.println("Wie viele Stockwerke wünschen Sie?");
        stockwerke = scanner.nextInt();

        for (int j = 1; j <= stockwerke; j++) {
            for (int i = 1; i <= wohnungen; i++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

}
