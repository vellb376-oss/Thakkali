import java.util.Scanner;

public class MultiplyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double result = num1 * num2;

        System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + result);

        sc.close();
    }
}
