package src.entity6;

public class Lezione15es7 {

    public static void main(String[] args) {
        int risultato1 = UtilityMath.valoreAssoluto(-28);
        double risultato2 = UtilityMath.valoreAssoluto(-45.7);

        System.out.println("Valore assoluto di -28: " + risultato1);
        System.out.println("Valore assoluto di -45.7: " + risultato2);
    }

    static class UtilityMath {

        public static int valoreAssoluto (int numero) {
            return Math.abs(numero);
        }

        public static double valoreAssoluto (double numero) {
            return Math.abs(numero);
        }
    }
}
