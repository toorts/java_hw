//? Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

import java.util.Scanner;

public class Task3 {
    
    public static boolean isPalindrome(String str) {
        // Удаление пробелов и приведение к нижнему регистру
        str = str.replaceAll("\\s+", "").toLowerCase();

        // Проверка палиндрома
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите строку: ");
            String str = scan.nextLine();

            if (isPalindrome(str)) {
                System.out.println("Это палиндром");
            } else {
                System.out.println("Это не палиндром");
            }
        }
    }

}
