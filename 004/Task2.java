//? Реализуйте очередь с помощью LinkedList со следующими методами:
//? enqueue() - помещает элемент в конец очереди,
//? dequeue() - возвращает первый элемент из очереди и удаляет его,
//? first() - возвращает первый элемент из очереди, не удаляя.


import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    private static final int ENQUEUE_OPTION = 1;
    private static final int DEQUEUE_OPTION = 2;
    private static final int FIRST_OPTION = 3;
    private static final int EXIT_OPTION = 4;

    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        do {
            System.out.println("Выберите действие:");
            System.out.println("1. Поместить элемент в конец очереди");
            System.out.println("2. Возвращает первый элемент из очереди и удаляет его");
            System.out.println("3. Возвращает первый элемент из очереди, не удаляя");
            System.out.println("4. Выход");
            System.out.print("Ваш выбор: ");

            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case ENQUEUE_OPTION:
                        System.out.print("Введите элемент для добавления: ");
                        int element = scanner.nextInt();
                        queue.addLast(element);
                        System.out.println("Элемент " + element + " добавлен в конец очереди");
                        break;
                    case DEQUEUE_OPTION:
                        if (queue.isEmpty()) {
                            System.out.println("Очередь пуста");
                        } else {
                            int removedElement = queue.pollFirst();
                            System.out.println("Удален элемент " + removedElement);
                        }
                        break;
                    case FIRST_OPTION:
                        if (queue.isEmpty()) {
                            System.out.println("Очередь пуста");
                        } else {
                            int firstElement = queue.peekFirst();
                            System.out.println("Первый элемент в очереди: " + firstElement);
                        }
                        break;
                    case EXIT_OPTION:
                        System.out.println("Программа завершена");
                        break;
                    default:
                        System.out.println("Неверный выбор, попробуйте еще раз");
                }
                System.out.println("\nТекущее содержимое очереди: " + queue);
            } catch (Exception e) {
                System.out.println("Неверный ввод, попробуйте еще раз");
                scanner.nextLine(); // очистка ввода
            }
            System.out.println();
        } while (choice != EXIT_OPTION);

        scanner.close();
    }
}
