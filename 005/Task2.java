//? Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
//? Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
//? Отсортировать по убыванию популярности имени.

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        String[] employees = {
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        };

        Map<String, Integer> nameCounts = new HashMap<>();

        for (String employee : employees) {
            String name = employee.split(" ")[0];
            if (nameCounts.containsKey(name)) {
                nameCounts.put(name, nameCounts.get(name) + 1);
            } else {
                nameCounts.put(name, 1);
            }
        }

        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(nameCounts.entrySet());
        sortedEntries.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        for (Map.Entry<String, Integer> entry : sortedEntries) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
