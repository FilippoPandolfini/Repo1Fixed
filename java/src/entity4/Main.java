package src.entity4;

public class Main {
    public static void main(String[] args) {
        Vehicle macchina = new Car("Dacia");
        Vehicle motorino = new Motorcycle("Yamaha");
        macchina.methodStart();
        motorino.methodStart();
        System.out.println(macchina.getBrand());
    }
}



/*
System.out.println(new StringBuilder().append("You may turn on the ").append(macchina.brand).append(" car by ").append(macchina.methodStart());
System.out.println(new StringBuilder().append("You may turn on the ").append(motorino.brand).append(" motorcycle by ").append(motorino.methodStart());
 */
