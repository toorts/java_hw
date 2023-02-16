//? Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"
// "фамилия":"Краснов","оценка":"5","предмет":"Физика"

//? Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
//? Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                StringBuilder stringBuilder = new StringBuilder();

                for (String part : parts) {
                    String[] keyValue = part.split(":");
                    String key = keyValue[0].replaceAll("\"", "");
                    String value = keyValue[1].replaceAll("\"", "").trim();

                    switch (key) {
                        case "фамилия":
                            stringBuilder.append("Студент ").append(value).append(" получил ");
                            break;
                        case "оценка":
                            stringBuilder.append(value).append(" по предмету ");
                            break;
                        case "предмет":
                            stringBuilder.append(value).append(".");
                            break;
                    }
                }

                System.out.println(stringBuilder.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
