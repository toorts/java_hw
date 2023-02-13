//? Реализовать простой калькулятор (+ - / *)

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            System.out.print("Enter first number: ");
            double num1 = scan.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scan.nextDouble();

            System.out.print("Enter an operator (+, -, /, *): ");
            char operator = scan.next().charAt(0);

            scan.close();

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("\nError! operator is not correct");
                    return;
            }

            System.out.println("\nResult: " + num1 + " " + operator + " " + num2 + " = " + result);
            // System.out.printf("Result: %f %c %f = %f", num1, operator, num2, result);
        }
    }
}
