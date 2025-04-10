package src.entity5;

public class Lion extends Animals {
    public Lion(String name, String age) {
        super(name, age);
    }

    @Override
    public void doAction() {
        System.out.println("eats meat");
    }

    @Override
    public String makeSound() {
        return this.getName() + " ROAR";
    }

}
