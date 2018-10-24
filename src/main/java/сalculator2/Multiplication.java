package сalculator2;

public class Multiplication extends Operation {


    public Multiplication(double number1, double number2) {
        super(number1, number2);
    }

    public double calculateResuit() {
        return getNumber1() * getNumber2();
    }
}
