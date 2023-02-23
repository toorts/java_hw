//? Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Random;

public class Task1 {

    public static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        LinkedList<Integer> reversed = new LinkedList<Integer>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Random rand = new Random();

        // заполнение списка случайными числами
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(100);
            list.add(num);
        }

        System.out.println("Original List: " + list);

        LinkedList<Integer> reversed = reverseList(list);
        System.out.println("Reversed List: " + reversed);
    }
}
