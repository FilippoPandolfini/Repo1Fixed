package src.entity6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lezione12extra {
    public static void main(String[] args) {
        List<String> marcheAuto = new ArrayList<>() {{
            this.addAll(List.of("Toyota", "Honda", "Nissan", "BMW", "Mercedes", "Audi", "Ford", "Chevrolet", "Dodge",
                    "Ferrari", "Lamborghini", "Maserati", "Volkswagen", "Peugeot", "Renault", "Suzuki"));
        }};



        for (String marcaAuto : marcheAuto) {
            System.out.println(marcaAuto);
        }

        ArrayList<String> autoM = new ArrayList<>();

        for (String gruppo : marcheAuto) {
                if (gruppo.startsWith("M")) {
                    autoM.add(gruppo);
            }
        }
        System.out.println("Marche che iniziano con M: " + autoM);
    }
}
