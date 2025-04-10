package src.entity3;

public abstract class Animal implements SoundEngine{
    String name;

    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    // public void makeSound() {}

    //public abstract void makeSound();
}