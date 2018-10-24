package calculate;

import java.util.Scanner;


public class Main {
    public static void main(String[] arg) {
        Operacionist op = new Operacionist(3,4);
        System.out.println(op.getSum());
        System.out.println(op.getSum().getOpType());
        System.out.println(op.getSum().getC());
        System.out.println(op.getSum().isFlag());
    }
}
