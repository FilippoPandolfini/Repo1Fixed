package src.entity4;

public abstract class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }
    public void setBrand(String brandIn) {
        this.brand = brandIn;
    }
    public abstract void methodStart();

}
