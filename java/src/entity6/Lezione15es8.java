package src.entity6;

import java.awt.*;

public class Lezione15es8 {

    public static void main(String[] args) {
        Lezione15es8classPersona.Persona persona1 = new Lezione15es8classPersona.Persona("Pippo");
        Lezione15es8classPersona.Persona persona2 = new Lezione15es8classPersona.Persona("Mimmo", 21);
        Lezione15es8classPersona.Persona persona3 = new Lezione15es8classPersona.Persona("Memmo", 33, "maschio");

        persona1.stampaInfo();
        persona2.stampaInfo();
        persona3.stampaInfo();

        Lezione15es8classPersona.Persona.stampaInfo(persona3);
    }
}
