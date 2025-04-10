package src.entity4;

public class Motorcycle extends Vehicle {
    public Motorcycle(String brand) {
        super(brand);
    }
    public void hasSidecar() {
        System.out.println("Has sidecar");
    }

    @Override
    public void methodStart(){
        System.out.println(this.getBrand() + " turn the key");
    }
}
