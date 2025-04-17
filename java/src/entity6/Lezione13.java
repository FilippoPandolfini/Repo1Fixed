package src.entity6;

import java.util.Enumeration;

public class Lezione13 {
    public static void main(String[] args) {

        /*
        // ESERCIZIO 1 > quasi

        elenconumero:
       for (int numero = 1; numero <= 10; numero++) {
           if (numero == 5) {
               break elenconumero;
           }
           System.out.println(numero);
       }
         */

        /*
        // ESERCIZIO 2

        for(int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
         */

        /*
        // ESERCIZIO 3

        int num[] = {1, 4, 7, 6, 24, 9, 0, 16};

        for (int i = 0; i < num.length; i++) {
            if (num[i] == 6) {
                System.out.println("Trovato alla posizione: " + i);
                break;
            }
        }
         */

        // ESERCIZIO 4

        /*
        int num[] = {1, 4, 7, 6, 24, 9, 0, 16};
        for (int i = 0; i <= num.length-1; i++) {
            if (num[i] % 2 != 0) {
             continue;
            }
            System.out.println(num[i]);
        }
         */

        /*
        // ESERCIZIO 5

        for (int num = 1; num <= 10; num++) {
            if (num % 2 == 0) {
                continue;
            } if (num > 8) {
                break;
            }
            System.out.println(num);
        }
         */

    }
}
