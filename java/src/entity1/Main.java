package src.entity1;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Filippo", "Pandolfini", 30);
        Person person2 = new Person("Stefano", "Antonelli", 31);
        Person person3 = new Person("Claudio", "Pippoli", 45);


        person1.doGreetings();
        person2.doGreetings();
        person3.doGreetings();
    }
}
