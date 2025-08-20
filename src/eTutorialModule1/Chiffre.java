package eTutorialModule1;

import java.util.Scanner;

public class Chiffre {
    /*
     * Ceasar-Verschlüsselung für ein beliebiges Zeichen
     */
    public static void main(String[] args) {

        String eingabeZeichen;
        int schluessel;
        char buchstabe;
        int buchstabe_ascii;
        StringBuilder verschluesselung = new StringBuilder();
        // Eingabe des zuverschlüsselten Zeichen und der Zahl wie die Verschlüsselung durchgeführt wird.
        Scanner scanner = new Scanner (System.in);
        System.out.println("Geben Sie das Zeichen ein welches Sie verschlüsseln wollen.");
        eingabeZeichen = scanner.next();
        System.out.println("Geben Sie die Zahl ein mit welcher Sie das Zeichen verschlüsseln wollen.");
        schluessel = scanner.nextInt();

        System.out.println("Sie haben " + eingabeZeichen + " und " + schluessel + " eingegeben");
        //Umrechnung des Zeichen in eine Zahl
        for (int i = 0; i < eingabeZeichen.length(); i++) {
            buchstabe = eingabeZeichen.charAt(i);
            buchstabe_ascii = buchstabe;
            //Zeichen mit dem Schlüssel erweitern
            buchstabe_ascii = buchstabe_ascii - schluessel;
            //Umrechnung von der Zahl in das verschlüsselte Zeichen.
            buchstabe = (char) buchstabe_ascii;
            verschluesselung.append(buchstabe);
        }

        System.out.println(verschluesselung);

    }
}
