package src.entity6;

public class Lezione15es8classPersona {
    static class Persona {
        private String nome;
        private Integer eta;
        private String attributi;

        public Persona(String nome) {
            this.nome = nome;
            this.eta = null;
            this.attributi = "Attributi sconociuti";
        }

        public Persona(String nome, int eta) {
            this.nome = nome;
            this.eta = eta;
            this.attributi = "Attributi sconosciuti";
        }

        public Persona(String nome, int eta, String attributi) {
            this.nome = nome;
            this.eta = eta;
            this.attributi = attributi;
        }

        public void stampaInfo() {
            System.out.println("La persona si chiama: " + this.nome);
            if (eta != null) {
                System.out.println("Età: " + this.eta);
            } else {
                System.out.println("Età: sconosciuta");
            }
            System.out.println("Attributi: " + attributi);
            System.out.println("___");
        }

        public static void stampaInfo(Persona persona) {
            System.out.println("La persona si chiama " + persona.nome + " e ha " + persona.eta + " anni.");
            persona.stampaInfo();
        }

    }
}
