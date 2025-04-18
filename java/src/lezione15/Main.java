package src.lezione15;

import static src.lezione15.Analizzatore.media;

public class Main {
    public static void main(String[] args) {
        int[] arrayInt = {1, 2, 4, 6, 9};
        double[] arrayDouble = {1.2, 4.5, 6.9, 1.2};

        System.out.println("Media int[]: " + media(arrayInt));
        System.out.println("Media doube[]: " + media(arrayDouble));
        System.out.println("Media di 3 double: " + media(1.2, 3.4, 3.0));
    }
}
