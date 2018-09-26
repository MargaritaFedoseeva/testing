import java.util.Scanner;

public class Calculator {
    public static void main(String []arg) {
        System.out.println("Калькулятор сложения");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число:");
        int a = scanner.nextInt();
        System.out.print("Введите второе число:");
        int b = scanner.nextInt();
        int c = a+b;
        System.out.printf("Результат сложения двух чисел %d + %d = %d \n", a , b, c);
        scanner.close();
    }
}
