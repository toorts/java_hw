//? Реализовать простой калькулятор (+ - / *)

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Enter first number: ");
            double num1 = scan.nextDouble();

            System.out.println("Enter second number: ");
            double num2 = scan.nextDouble();

            System.out.println("Enter an operator (+, -, /, *): ");
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
                    System.out.println("Error! operator is not correct");
                    return;

            }

            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
}
