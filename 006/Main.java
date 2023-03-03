import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        NoteBook notebook1 = new NoteBook("Apple", 8, 256, "MacOS", "silver");
        NoteBook notebook2 = new NoteBook("Samsung", 16, 1000, "Windows 10", "black");
        NoteBook notebook3 = new NoteBook("Asus", 32, 2000, "Windows 10", "gray");
        NoteBook notebook4 = new NoteBook("HP", 16, 1000, "Windows 11", "white");
        NoteBook notebook5 = new NoteBook("Lenovo", 16, 500, "Windows 10", "black");

        NoteBook[] notebooks = {notebook1, notebook2, notebook3, notebook4, notebook5};

        Map<String, Object> filters = new HashMap<>();
        System.out.println("Выберите критерий фильтрации:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем жесткого диска");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        int choice = Integer.parseInt(System.console().readLine());
        switch (choice) {
            case 1:
                System.out.println("Введите минимальный объем ОЗУ:");
                int ramSize = Integer.parseInt(System.console().readLine());
                filters.put("ramSize", ramSize);
                break;
            case 2:
                System.out.println("Введите минимальный объем жесткого диска:");
                int hddSize = Integer.parseInt(System.console().readLine());
                filters.put("hddSize", hddSize);
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                String os = System.console().readLine();
                filters.put("os", os);
                break;
            case 4:
                System.out.println("Введите цвет:");
                String color = System.console().readLine();
                filters.put("color", color);
                break;
            default:
                System.out.println("Некорректный выбор.");
                break;
        }

        NoteBook.filterNotebooks(notebooks, filters);
    }
}

