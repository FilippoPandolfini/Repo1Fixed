package src.entity5;

public class Elephant extends Animals {
    public Elephant(String name, String age) {
        super(name, age);
    }

    @Override
    public void doAction() {
        System.out.println("steals hat");
    }

    @Override
    public String makeSound() {
        return this.getName() + " POOW";
    }

}
