package entity1;

public class Person {

    String name;
    String surname;
    int age;

    public Person(String nameIn, String surnameIn, int ageIn) {
        this.name = nameIn;
        this.surname = surnameIn;
        this.age = ageIn;
    }

    public void doGreetings() {
        System.out.println("Hello, I'm " + this.name + " " + this.surname + ", and I'm " + this.age + "!");
    }
}