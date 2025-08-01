package org.example;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Toto mi vypise do konzole Ahoj svete!

        System.out.println("Ahoj svete!");
        System.out.println("Ahoj svete!");

        String pozdrav = "Ahoj svete";
        int cislo1 = 5;
        int cislo2 = 658;
        boolean pravdaNepravda = true;
        float desetinneCislo = 5.5f;

        System.out.println(pozdrav);
        System.out.println(pozdrav);
        System.out.println(pozdrav + cislo1);
        System.out.println(cislo1 + cislo2);


        //Tato cast kodu me pozdravi
        Scanner mujScanner = new Scanner(System.in);
        System.out.println("Vepis sve jmeno:");
        String mojeJmeno = mujScanner.nextLine();
        System.out.println("Ahoj " + mojeJmeno);

        //Toto je konstanta
        //final int cis1 = 55;

        //Kalkulacka
        int prvniCislo;
        int druheCislo;
        System.out.println("Vepis prvni cislo:");
        prvniCislo = mujScanner.nextInt();
        System.out.println("Vepis druhe cislo:");
        druheCislo = mujScanner.nextInt();

        System.out.println(prvniCislo + druheCislo);
        System.out.println(prvniCislo - druheCislo);
        System.out.println(prvniCislo * druheCislo);
        System.out.println(prvniCislo / druheCislo);

        String pozdrav2 = "Ahoj svete";
        System.out.println(pozdrav2.length());

    }
}