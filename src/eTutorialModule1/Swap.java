package eTutorialModule1;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        String a;
        String b;
        String c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie einen Namen ein.");
        a = sc.nextLine();
        System.out.println("Geben Sie einen zweiten Namen ein.");
        b = sc.nextLine();


        System.out.println(a + " und " + b);

        c = a;
        a = b;
        b = c;

        System.out.println(a + " und " + b);
    }
}
