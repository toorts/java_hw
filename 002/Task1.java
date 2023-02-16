//? Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), результат после каждой итерации запишите в лог-файл.

import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 7, 2, 3 };
        Logger logger = Logger.getLogger(Task1.class.getName());
        FileHandler fh;

        try {
            // Настраиваем логгер для записи в файл
            fh = new FileHandler("log.txt");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            logger.info("Исходный массив: " + Arrays.toString(arr));

            // Реализация алгоритма сортировки пузырьком
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
                logger.info("После итерации " + (i + 1) + ": " + Arrays.toString(arr));
            }

            logger.info("Отсортированный массив: " + Arrays.toString(arr));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
