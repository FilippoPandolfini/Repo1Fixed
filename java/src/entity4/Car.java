package src.entity4;

public class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    public void numberOfDoors() {
        System.out.println("Has 4 doors");
    }

    @Override
    public void methodStart(){
        System.out.println(this.getBrand() + " pressing the button");
    }
}
