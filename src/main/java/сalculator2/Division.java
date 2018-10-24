package сalculator2;

public class Division extends Operation {


    public Division(double number1, double number2) {
        super(number1, number2);
    }

    public double calculateResuit() {
        if(getNumber2()==0){
            throw new DivisionException("На ноль делить нельзя!");
        }
        return getNumber1() / getNumber2();
    }
}
