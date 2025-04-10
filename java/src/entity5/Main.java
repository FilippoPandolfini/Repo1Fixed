package src.entity5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lion leone = new Lion ("Gigio", "12");
        Elephant elefante = new Elephant ("Michele", "32");
        Monkey monkey = new Monkey ("Andrea", "3");
        // System.out.println(leone.makeSound());
        List<Animals> listaversi = new ArrayList<>(List.of(leone, elefante, monkey));
        for (Animals animal : listaversi) {
            System.out.println(animal.makeSound());
        }
    }
}
