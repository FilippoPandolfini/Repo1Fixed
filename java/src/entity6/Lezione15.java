package src.entity6;

import java.util.Scanner;

public class Lezione15 {
    public static void main(String[] args) {

        Stampante s = new Stampante();

        s.stampa("Ciao mondo!");
        s.stampa(42);

        String[] messaggi = {"Ciao", "Come va?", "Tutto been?"};
        s.stampa(messaggi);
    }
}

        class Stampante {

            public void stampa(String[] pippo) {
                for (String stringa : pippo) {
                    System.out.println(stringa);
                }
            }

            public void stampa(int numeroPippo) {
                System.out.println(numeroPippo);
            }

            public void stampa(String stringaPippo) {
                System.out.println(stringaPippo);
            }

            }

