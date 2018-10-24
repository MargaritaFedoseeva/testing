package сalculator2;

public class Addition extends Operation {


    public Addition(double number1, double number2) {
        super(number1, number2);
    }

    public double calculateResuit() {
        return getNumber1() + getNumber2();
    }
}
