//? В калькулятор добавьте возможность отменить последнюю операцию.
// Пример

// 1
// +
// 2
// ответ:
// 3

// +
// 4
// ответ:
// 7

// Отмена
// 3
// *
// 3

// ответ:
// 9
// Дополнительно каскадная отмена - отмена нескольких операций

import java.util.Scanner;
import java.util.Stack;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Stack<Double> resultsStack = new Stack<>();
        boolean exit = false;

        while (!exit) {
            System.out.print("Enter first number: ");
            double num1 = scan.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scan.nextDouble();

            System.out.print("Enter an operator (+, -, /, *, u to undo, q to quit): ");
            char operator = scan.next().charAt(0);

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
                case 'u':
                    if (!resultsStack.isEmpty()) {
                        System.out.println("\nUndo last operation");
                        result = resultsStack.pop();
                        break;
                    }
                case 'q':
                    exit = true;
                    System.out.println("\nExiting calculator");
                    continue;
                default:
                    System.out.println("\nError! operator is not correct");
                    continue;
            }
            resultsStack.push(result);
            System.out.println("\nResult: " + num1 + " " + operator + " " + num2 + " = " + result);
        }

        scan.close();
    }
}
