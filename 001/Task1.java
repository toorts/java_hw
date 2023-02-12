//? Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            int triangularNumber = n * (n + 1) / 2;

            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println("The " + n + "th triangular number is " + triangularNumber);
            System.out.println(n + "! = " + factorial);

            sc.close();
        }
    }
}
