package src.entity2;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(0, 0);

        System.out.println("I numeri sono: " + calculator.num1 + " e " + calculator.num2);
        System.out.println("La somma dei due numeri è: " + calculator.somma());
        System.out.println("La sottrazione dei due numeri è: " + calculator.sottrazione());
        System.out.println("La moltiplicazione dei due numeri è: " + calculator.moltiplicazione());
        try {
            System.out.println("La divisione dei due numeri è: " + calculator.divisione());
            System.out.println("post excp in try");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("post excp after");
    }
}
