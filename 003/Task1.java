//? Пусть дан произвольный список целых чисел, удалить из него четные числа.

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        // создаем список из 10 случайных целых чисел
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random rand = new Random();
        System.out.print("Список из 10 случайных чисел: ");
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(100) + 1;
            numbers.add(num);
            System.out.print(num + " ");
        }
        System.out.println();

        // удаляем четные числа
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--;
            }
        }

        // выводим список без четных чисел
        System.out.print("Список без четных чисел: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
