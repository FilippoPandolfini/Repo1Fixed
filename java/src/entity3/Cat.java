package src.entity3;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("MEOW");
    }

    public void swim() {
        System.out.println("blub blub blub");
    }
}
