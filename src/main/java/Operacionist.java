
public class Operacionist {
    private double a;
    private double b;
    private Results c;

    public Operacionist(double a, double b) {
        this();
        this.a = a;
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }


    public double getA() {

        return a;
    }

    public double getB() {
        return b;
    }

    public Operacionist() {
        this.a = 0;
        this.b = 0;
        this.c = new Results();
    }
    private void doCalc(double v,boolean b,String sum){
        c.setC(v);
        c.setFlag(b);
        c.setOpType(sum);
    }

    public Results getSum() {
       doCalc(a+b,true,"SUM");
        return c;
    }
    public Results getDiv() {
        if (b==0){
            doCalc(-1,false,"DIV");
        }else {
            doCalc(a/b,true,"DIV");
        }
        return c;
    }
}
