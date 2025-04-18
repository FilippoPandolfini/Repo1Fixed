package src.entity6;

public class Lezione14 {
    public static int main(String[] args) {

        /*
        // ESERCIZIO 1
        public int somma(int primoNumero, int secondoNumero) {
            return primoNumero + secondoNumero;
        }
         */

        /*
        // ESERCIZIO 3

        public int quadrato(int numero) {
            return numero * numero;
        }

        public void usaMetodo() {
            int risultato = quadrato(5);
        }
         */

        /*
        // ESERCIZIO 4

        public double areaRettangolo (double base, double altezza) {
            return (double) (base * altezza);
        }
         */

        /*
        // ESERCIZIO 5

        public boolean isPari (int numero) {
            if (numero % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }
         */

        /*
        // ESERCIZIO 6

        // mio esercizio
        public int celsiusToFahrenheit (int celsius) {
            int farhenheit = celsius * 9 / 5 + 32;
            return farhenheit;
        }
        // correzione
        public double celsiusToFahrenheit (double celsius) {
            return celsius * 9 / 5 + 32;
        }
         */

        /*
        // ESERCIZIO 7

        // mio esercizio
        public double media (double numeri[]) {
            return (numeri+=)/ numeri.length-1;
        }

        // correzione con array
        public double media(double[] numeri) {
            double somma = 0;
            for (double n : numeri) {
                somma += n;
            }
            return somma / numeri.length;
        }

        // correzione con varargs
        public double media(double... numeri) {
            double somma = 0;
            for (double n : numeri) {
                somma += n;
            }
            return somma / numeri.length;
        }
         */

        /*
        // ESERCIZIO 8 > guidato

        public int fattoriale(int n) {
            if (n < 0)
                throw new IllegalArgumentException("Il fattoriale non è definito per numeri negativi");
            if (n == 0 || n == 1)
                return 1;
            return n * fattoriale(n - 1); // chiamata ricorsiva
        }
         */

        /*
        // ESERCIZIO 9

        public void saluta() {
            System.out.println("Ciao!");
        }

        public String saluta (String nome) {
            return "Ciao, " + nome + "!";
        }
         */

        // ESERCIZIO 10
/*
        public static int doppio (int numero) {
            return numero*2;
        }

 */

        return 0;
    }
}
