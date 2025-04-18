package src.entity6;

public class Lezione15es5 {

    public static void main(String[] args) {
        Libro libro1 = new Libro("Il nome della Rosa");
        Libro libro2 = new Libro("1984", "George Orwell");
        Libro libro3 = new Libro("I promessi sposi", "Alessandro Manzoni", 1827);

        libro1.dettagli();
        libro2.dettagli();
        libro3.dettagli();
    }

    static class Libro {

        private String titolo;
        private String autore;
        private int annoPubblicazione;

        public Libro(String titolo) {
            this.titolo = titolo;
            this.autore = "Autore sconosiuto";
            this.annoPubblicazione = -1;
        }

        public Libro (String titolo, String autore) {
            this.titolo = titolo;
            this.autore = autore;
            this.annoPubblicazione = -1;
        }

        public Libro (String titolo, String autore, int annoPubblicazione)  {
            this.titolo = titolo;
            this.autore = autore;
            this.annoPubblicazione = annoPubblicazione;
        }
        public void dettagli() {
            System.out.println("Titolo: " + titolo);
            System.out.println("Autore: " + autore);
            if (annoPubblicazione != -1) {
                System.out.println("Anno di pubblicazione: " + annoPubblicazione);
            } else {
                System.out.println("Anno di pubblicazione: sconosciuto");
            }
            System.out.println("---");
        }
    }
}
