package src.entity5;

public class Monkey extends Animals {
    public Monkey(String name, String age) {
        super(name, age);
    }

    @Override
    public void doAction() {
        System.out.println("throw banana");
    }

    @Override
    public String makeSound() {
        return this.getName() + " HUHI";
    }
}
