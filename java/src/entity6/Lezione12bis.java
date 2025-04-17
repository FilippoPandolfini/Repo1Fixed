package src.entity6;

import java.util.Scanner;

public class Lezione12bis {
    public static void main(String[] args) {
        /*
        // ESERCIZIO 1

        for (int num = 1; num <= 10; num++)
            if (num < 10) {
                System.out.print(num + ", ");
            } else {
                System.out.println(num + ".");
            }
         */

        /*
        // ESERCIZIO 2
        int somma = 0;
        for (int num = 1; num <= 100; num++) {
            somma += num;
        }
        System.out.println("La somma dei numeri da 1 a 100 è: " + somma);
         */

        /*
        // ESERCIZIO 3
        for (int num = 1; num <= 20; num++) {
            if (num % 2 == 0 && num < 20) {
                System.out.print(num + ", ");
            } else {
                if (num == 20) {
                    System.out.println(num + ".");
                }
            }
        }
         */

        /*
        // ESERCIZIO 4 > finito con aiuto

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero positivo:");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Numero non conforme");
        } else {
            for (int i = num; i>=0; i--) {
                System.out.println("Conto alla rovescia: " + i);
            }
        }
        scanner.close();
         */

        /*
        // ESERCIZIO 5 > con aiutino

        String nome = "Pepe";
        for (int i = 0; i < nome.length(); i++)
            System.out.println(nome.charAt(i));
         */

        /*
        // ESERCIZIO 6 > in autonomia ma attingendo a vecchi esercizi

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero positivo:");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Numero non conforme");
        } else {
            int fattoriale = 1;
            for (int i = 1; i <= num; i++) {
                fattoriale *= i;
            }
                System.out.println("Il fattoriale di " + num + " è: " + fattoriale);
        }
        scanner.close();
         */

        /*
        // ESERCIZIO 7 > finito con aiuto

        int n = 10; // valore assegnato direttamente

        int sommaPari = 0;
        int sommaDispari = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sommaPari += i;
            } else {
                sommaDispari += i;
            }
        }

        System.out.println("Somma dei numeri pari da 1 a " + n + ": " + sommaPari);
        System.out.println("Somma dei numeri dispari da 1 a " + n + ": " + sommaDispari);
         */

        /*
        // ESERCIZIO 8 > non completato autonomamente

        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println(); // Vai a capo dopo ogni riga
        }
         */

        /*
        // ESERCIZIO 9

        for (int numBase = 1; numBase <= 10; numBase++) {
            System.out.print("Tabellina del " + numBase + ": ");
            for (int numTab = 1; numTab <= 10; numTab++) {
                System.out.print(numBase*numTab + " ");
            } System.out.println();
        }
         */

        // ESERCIZIO 10

        /*
        for (int num = 1; num <= 100; num++) {
            if ( num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");}
            else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(num);
            }
        }
         */

    }
}
