import java.util.Random;
import java.util.Scanner;


public class HomeWork3 {
    public static int size = 5;
    public static char[][] map = new char[size][size];
    public static char humanChar = 'X', aiChar = 'O', emptyChar = '_';
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void createMap() { //создаем пустое поле
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = emptyChar;
            }
        }
    }

    public static void printMap() { // создаем отображение поля
        for (int i = 1; i < size + 1; i++) {
            System.out.print(" " + i + " ");
        }
            System.out.println();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + "  ");
            }
                System.out.println(i + 1);
        }
            System.out.println("---------------");
    }

    public static void humanTurn() { //метод для ходов игрока
        int x;
        int y;

        do {
            System.out.println("Выберите положение ячейки по осям: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isValidCell(y, x) || !isEmpty(y, x));

        map[y][x] = humanChar;

    }

    public static void aiTurn() { // метод для ходов компьютера
        int countH = 0, countHEmpty = 0, countW = 0, countWEmpty = 0;
        for (int i = 0; i < size; i++) {
            countH = 0;
            countHEmpty = 0;
            countW = 0;
            countWEmpty = 0;
            for (int j = 0; j < size; j++) {
                if (map[j][i] == humanChar) countW++; //учесть ход игрока по вертикали
                else if (map[j][i] == emptyChar) countWEmpty++;
                if ((countW == size - 1) && (countWEmpty == 1)) {
                    for (int k = 0; k < size; k++) {
                        if (map[k][i] == emptyChar) {
                            map[k][i] = aiChar;
                            return;
                        }
                    }
                }
                if (map[i][j] == humanChar) countH++; // учесть ход игрока по горизонтали
                else if (map[i][j] == emptyChar) countHEmpty++;
                if ((countH == size - 1) && (countHEmpty == 1)) {
                    for (int k = 0; k < size; k++) {
                        if (map[i][k] == emptyChar) {
                            map[i][k] = aiChar;
                            return;
                        }
                    }
                }

            }
        }
       /*int x; //рандомный ход компьютера
        int y;

        do {
            x = random.nextInt(size);
            y = random.nextInt(size);
        } while (!isEmpty(y, x));

        map[y][x] = aiChar;*/
    }
    public static boolean isValidCell(int y, int x) { // проверка корректности ячейки
        if (x < 0 || y < 0 || x >= size || y >= size) return false;
        if (map[y][x] == emptyChar) return true;
        return false;
    }
    public static boolean isEmpty(int y, int x) { // проверка что ячейка пуста
        return map[y][x] == emptyChar;
    }
    public static boolean checkWin(char playerChar) { //проверка комбинаций на победу
         int countW;
         int countH;
         int countCrossA = 0;
         int countCrossB = 0;
         for (int i = 0; i <= size - 1; i++) {
             countH = 0;
             countW = 0;
             for (int j = 0; j <= size - 1; j++) {
                 if (map[i][j] == playerChar) { //проверка по горизонтали
                     countH++;
                     if (countH == size) return true;
                 }
                 if (map[j][i] == playerChar) { // проверка по вертикали
                    countW++;
                    if (countW == size) return true;
                 }
             }
            if (map[i][i] == playerChar) { // проверка заполнения наискось  "\"
                countCrossA++;
                if (countCrossA == size) return true;
            } else countCrossA = 0;

            if (map[i][size - 1 - i] == playerChar) { // проверка заполнения наискось "/"
                countCrossB++;
                if (countCrossB == size) return true;
            } else countCrossB = 0;
        }
        return false;
     }

    public static boolean isMapFull() { //проверка заполненности игрового поля
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == emptyChar) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
      //  HomeWork3 game = new HomeWork3();
        createMap();
        printMap();

        while (true) { // процесс игры

            humanTurn();
            printMap();
            if (checkWin(humanChar)) {
                System.out.println(humanChar + " WIN");
                break;
            }

            if (isMapFull()) {
                System.out.println("DRAW!");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(aiChar)) {
                System.out.println(aiChar + " WIN");
                break;
            }

            if (isMapFull()) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

}
