package src.entity2;

public class Calculator {

    double num1;
    double num2;

    public Calculator(double num1In, double num2In) {
        this.num1 = num1In;
        this.num2 = num2In;
    }


    public double somma() {
        return this.num1 + this.num2;
    }

    public double sottrazione() {
        return this.num1 - this.num2;
    }

    public double moltiplicazione() {
        return this.num1 * this.num2;
    }


    public double divisione() throws ArithmeticException {
        if (this.num2 == 0) {
            throw new ArithmeticException("Impossibile dividere per zero");
        }
        return this.num1 / this.num2;
    }


/*
    public double divisione() {
        try {
            return this.num1 / this.num2;
        } catch (ArithmeticException err) {
            System.out.println("Errore: " + err.getMessage());
        }
        return 0;
        }
     */
}

