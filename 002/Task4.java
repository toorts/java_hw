//? К калькулятору из предыдущего дз добавить логирование.

import java.util.Scanner;
import java.util.logging.*;

public class Task4 {
    private static final Logger LOGGER = Logger.getLogger(Task4.class.getName());

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LOGGER.info("Calculation started");

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
                LOGGER.log(Level.WARNING, "Error! operator is not correct");
                return;            
        }

        LOGGER.log(Level.INFO, String.format("Result: %f %c %f = %f", num1, operator, num2, result));
        
    }
}
