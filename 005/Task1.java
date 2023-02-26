//? Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
//? Добавить функции:
//? 1) Добавление номера
//? 2) Вывод всего

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    private Map<String, ArrayList<String>> phonebook = new HashMap<>();

    public void addNumber(String name, String phone) {
        ArrayList<String> phones = phonebook.get(name);
        if (phones == null) {
            phones = new ArrayList<>();
            phones.add(phone);
            phonebook.put(name, phones);
        } else {
            phones.add(phone);
        }
    }

    public void printAll() {
        for (String name : phonebook.keySet()) {
            System.out.print(name + ": ");
            ArrayList<String> phones = phonebook.get(name);
            for (String phone : phones) {
                System.out.print(phone + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Task1 phonebook = new Task1();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите команду (add - добавить номер, print - вывод, exit - выход):");
            String command = scanner.nextLine();

            if (command.equals("add")) {
                System.out.println("Введите имя:");
                String name = scanner.nextLine();
                System.out.println("Введите номер телефона:");
                String phone = scanner.nextLine();
                phonebook.addNumber(name, phone);

            } else if (command.equals("print")) {
                phonebook.printAll();

            } else if (command.equals("exit")) {
                break;
                
            } else {
                System.out.println("Неверная команда.");
            }
        
        }
    
    }
    
}
