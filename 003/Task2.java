//? Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        // создаем ArrayList с 10 случайными целыми числами от 0 до 99
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(100);
            numbers.add(number);
        }
        System.out.println("Список чисел: " + numbers);

        // находим минимальное число
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Минимальное число: " + min);

        // находим максимальное число
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Максимальное число: " + max);

        // находим среднее арифметическое
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.size();
        System.out.println("Среднее арифметическое: " + average);
    }
}
