import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        changeArray();
        System.out.println("\nЗадание 2:");
        createArray();
        System.out.println("\nЗадание 3:");
        doubleArray();
        System.out.println("\nЗадание 4:");
        minMaxArray();
        System.out.println("\nЗадание 5:");
        quadArray();
        //  System.out.println("\nЗадание 6:");
        // moveArray();

    }

// 1 Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;

    public static void changeArray() {
        int[] myChange = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("Дан массив: ");
        for (int i = 0; i < myChange.length; i++) {
            System.out.print(myChange[i] + " | ");
        }
        System.out.print("\nМеняем 0 и 1 местами: ");
        for (int i = 0; i < myChange.length; i++) {
            if (myChange[i] == 1) myChange[i] = 0;
            else myChange[i] = 1;
            System.out.print(myChange[i] + " | ");
        }

    }

// 2 Задать пустой целочисленный массив размером 8.
// Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;

    public static void createArray() {
        int[] myCreate = new int[8];
        System.out.print("Заполним пустой массив: ");
        for (int i = 1; i < 23; i += 3) {
            System.out.print(" [" + i + "] ");
        }
    }

// 3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,
// принимающий на вход массив и умножающий числа меньше 6 на 2;

    public static void doubleArray() {
        int[] myDouble = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Дан массив: ");
        for (int i = 0; i < myDouble.length; i++) {
            System.out.print(myDouble[i] + " | ");
        }
        System.out.print("\nУмножим все числа менее 6 на 2: ");
        for (int i = 0; i < myDouble.length; i++) {
            if (myDouble[i] < 6) myDouble[i] *= 2;
            System.out.print(myDouble[i] + " | ");
        }
    }

// 4 Задать одномерный массив. Написать методы поиска в нём минимального
// и максимального элемента;

    public static void minMaxArray() {
        int[] myArray = {1, 5, 3, 2, 11, -14, 54, 12, 4, 8};
        int min = myArray[0];
        int max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < min)
            min = myArray[i];
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max)
                max = myArray[i];
        }
        System.out.println("Минимальное число: " + min + "\nМаксимальное число: " + max);

    }


// 5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
// заполнить его диагональные элементы единицами, используя цикл(ы);
    public static void quadArray() {
        int addOne = 1;
        int[][] oneArray= new int[5][5];
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if((i == j) || (i == 5 - 1 - j))
                oneArray [i][j] = addOne;
                System.out.print(oneArray [i][j] + "\t");

            }
            System.out.println();
        }
    }

// 6 ** Написать метод, которому на вход подаётся одномерный массив и число n
// (может быть положительным, или отрицательным), при этом метод должен циклически
// сместить все элементы массива на n позиций.
          //  [1,2,3,4,5], -2 => [3,4,5,1,2]
          //  [1,2,3,4,5], 2 => [4,5,1,2,3]

   /* public static void moveArray() {
        int n = -2;
        int [] myMove = {1,2,3,4,5};


            System.out.print(myMove + " | ");

    }*/

// 7 **** Не пользоваться вспомогательным массивом при решении задачи 6.

}
