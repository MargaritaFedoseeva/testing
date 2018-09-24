import java.util.Scanner;

public class Hello {
    public static void main(String []arg) {
        System.out.println("Калькулятор сложения");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число:");
        int a = scanner.nextInt();
        System.out.print("Введите второе число:");
        int b = scanner.nextInt();
        System.out.println("Результат сложения двух чисел "+ a +" и "+ b +" = "+(a+b));
        scanner.close();
    }
}
