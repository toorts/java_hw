//? На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску. Пример вывода доски 8x8
// 0x000000
// 0000x000
// 00x00000

public class Task3 {

    // Массив для хранения расстановки ферзей на доске
    private static int[] queens = new int[8];

    // Рекурсивная функция для поиска расстановки ферзей
    private static boolean findQueensPlacement(int row) {
        if (row == 8) {  // Если удалось расставить всех 8 ферзей, вернуть true
            return true;
        }
        for (int col = 0; col < 8; col++) {
            boolean isSafe = true;
            for (int i = 0; i < row; i++) {
                // Проверка на наличие конфликта по вертикали, диагонали и антидиагонали
                if (queens[i] == col || queens[i] == col - row + i || queens[i] == col + row - i) {
                    isSafe = false;
                    break;
                }
            }
            if (isSafe) {
                queens[row] = col;  // Сохранить расстановку ферзя в массив
                if (findQueensPlacement(row + 1)) {  // Рекурсивный вызов для следующего ряда
                    return true;
                }
            }
        }
        return false;  // Если удалось найти неразрешимую расстановку, вернуть false
    }

    public static void main(String[] args) {
        // Вызов рекурсивной функции для поиска расстановки ферзей
        findQueensPlacement(0);

        // Вывод расстановки на доске
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (queens[row] == col) {
                    System.out.print("Q");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
