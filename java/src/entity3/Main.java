package src.entity3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat gatto = new Cat("Gino");
        Macchina car = new Macchina();
        List<SoundEngine> listasuonatori = new ArrayList<>(List.of(car, gatto));
        for (SoundEngine sound : listasuonatori) {
            sound.makeSound();
        }

    }

}

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Di quale animale vuoi conoscere il verso? \n" +
                "1 " + animal.getName() + " 2 " + animal2.getName() +
                " 3 " + animal3.getName() + " 4 " + animal4.getName());
        int choice = scanner.nextInt();

        if (choice == 3) {
            System.out.println("La " + animal3.getName() + " fa " + animal3.getMakeSound());
        } else if (choice == 4) {
            System.out.println("Il " + animal4.getName() + " fa " + animal4.getMakeSound() +
                    " ... A quanto pare non lo sappiamo!");
        } else {
            System.out.println("Il " + animal.getName() + " fa " + animal.getMakeSound());
        }

         */
