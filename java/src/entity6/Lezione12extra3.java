package src.entity6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lezione12extra3 {
    public static void main(String[] args) {

        List<String> studenti = new ArrayList<>() {{
           this.addAll(List.of("Sandro", "Valerio", "Stefano", "Michele", "Manuel", "Giorgio", "Andrea"));
        }};

        for (String nome : studenti) {
            System.out.println(nome);
        }

        List<String> nomiConA = new ArrayList<>();

        for (String nome : studenti) {
            if (nome.startsWith("A")) {
                nomiConA.add(nome);
            }
        }
        if (nomiConA.isEmpty()) {
            System.out.println("Nessun nome inizia con A");
        } else {
            System.out.println("Nomi che iniziano con A: " + nomiConA);
        }

    }
}
