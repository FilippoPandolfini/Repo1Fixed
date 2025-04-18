package src.lezione15;

public class Analizzatore {

    public static double media(int[] numeri) {
        int somma = 0;
        for (int n : numeri) {
            somma += n;
        }
        return (double) somma / numeri.length;
    }

    public static double media(double[] numeri) {
        double somma = 0;
        for (double n : numeri) {
            somma += n;
        }
        return somma / numeri.length;
    }

    public static double media(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
