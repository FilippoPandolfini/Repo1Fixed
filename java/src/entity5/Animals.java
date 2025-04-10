package src.entity5;

public abstract class Animals {
    private String name;
    private String age;

    public Animals(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String nameIn){
    this.name = nameIn;
}

    public String getAge() {
        return this.age;
    }

    public void setAge(String ageIn) {
    this.age = ageIn;
}

    public abstract String makeSound();
    public abstract void doAction();
}