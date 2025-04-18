package src.entity6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lezione12extra2 {
    public static void main(String[] args) {

        List<String> citta = new ArrayList<>() {{
            this.addAll(List.of("Milano", "Roma","Torino", "Napoli", "Siena", "Salerno", "Firenze", "Ravenna"));
        }};

        for (String nome : citta) {
            System.out.println(nome);
        }

        List<String> cittaConR = new ArrayList<>();

        for (String nome : citta) {
            if (nome.startsWith("R")) {
                cittaConR.add(nome);
            }
        }
        System.out.println("Città che iniziano con R: " + cittaConR);
    }
}
