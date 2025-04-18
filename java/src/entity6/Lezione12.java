package src.entity6;

import java.util.*;

public class Lezione12 {
    public static void main(String[] args) {

        // ESERCIZIO 1
        for (int num = 0; num < 10; num++)
            System.out.println("Il numero è: " + num+1);


        // ESERCIZIO 2 > fraintendimento nella richiesta

        int somma = 0;

        for (int num = 0; num < 100; num++) {
            if (num % 2 == 0) {
                somma += num;
            }
        }
        System.out.println("La somma dei numeri pari da 1 a 100 è: " + somma);



        // ESERCIZIO 3
        for (int num = 0; (5*num)<50; num++) {
            System.out.println(5 + " * " + num + " = " + (5*num));
        }



        // ESERCIZIO 4 > non risolto senza chat
        int[] numeri = {3, 7, 2, 9, 4};

        for (int numero : numeri) {
            System.out.println(numero);
        }


        // ESERCIZIO 5 > non completato

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il numero:");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Inserisci un numero positivo");
        } else {
            int fattoriale = 1;
            for (int i = 1 ; i <= n; i++) {
                fattoriale *= i;
            }
            System.out.println("Il fattoriale di " + n + " è: " + fattoriale);
        }
        scanner.close();


        /*
        // ESERCIZIO 6 > non compilato autonomamente

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Vai a capo dopo ogni riga
        }
         */

        /*
        // ESERCIZIO 7 > non risolto autonomamente

        String[] nomi = {"Luca", "Marco", "Anna", "Giulia", "Francesca"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il nome da cercare:");
        String nomeRicerca = scanner.nextLine();

        boolean trovato = false;

        for (int i = 0; i < nomi.length; i++) {
            if (nomi[i].equalsIgnoreCase(nomeRicerca)) {
                trovato = true;
                break; // trovato, possiamo uscire dal ciclo
            }
        }

        if (trovato) {
            System.out.println("La ricerca ha avuto esito positivo!");
        } else {
            System.out.println("La ricerca non ha avuto esito positivo.");
        }
        scanner.close();
         */

        /*
        // ESERCIZIO 8 > guidato

        int somma = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                somma += i;
            }
        }
        System.out.println("La somma dei numeri pari da 1 a 100 è: " + somma);
         */

        /*
        // ESERCIZIO 9 guidato
        for (int i = 1; i <= 50; i++)
            if (i % 3 == 0) {
                System.out.println(i);
            }
         */
    }
}
