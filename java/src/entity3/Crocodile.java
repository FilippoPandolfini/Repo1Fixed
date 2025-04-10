package src.entity3;

public class Crocodile extends Animal {
    public Crocodile(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("????");
    }
}
