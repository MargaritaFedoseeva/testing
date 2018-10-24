package сalculator2;

public abstract class Operation {
    private double number1;

    public double getNumber1() {
        return number1;
    }

    public Operation(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public abstract double calculateResuit();

    public double getNumber2() {
        return number2;
    }

    private double number2;
}
