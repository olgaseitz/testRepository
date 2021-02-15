public class Homework1 {
    public static void main(String[] args) {
        myFloat(5, 3, 27, 4);
        System.out.println("Задание 1 \nРезультат: " + myFloat(5,3,27,4));
        mySum(4, 11);
        System.out.println("Задание 2 \nРезультат: " + mySum(4, 11));
        myPositive(-16);
        myName("переданное_имя");

    }

    // Первое задание. Написать метод вычисляющий выражение a * (b + (c / d)) и
//    возвращающий результат с плавающей точкой, где a, b, c, d – целочисленные входные параметры этого метода;
    public static float myFloat(int a, int b, int c, int d) {
        return a * (b + (c / (d * 1f)));
    }

    // Второе задание. Написать метод, принимающий на вход два целых числа,
//и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
//если да – вернуть true, в противном случае – false;
    public static boolean mySum(int x, int y) {
        int sum = x + y;
        if (sum > 9 && sum < 21) return true;
        else return false;
    }

    // Третье задание. Написать метод, которому в качестве параметра передается целое число,
//метод должен проверить положительное ли число передали, или отрицательное.
//Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль
    public static void myPositive(int number) {
        System.out.println("Задание 3");
        if (number >= 0) {
            System.out.println("Число " + number + " положительное");
        } else {
            System.out.println("Число " + number + " отрицательное");
        }
    }

    // Четвертое задание. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
//метод должен вернуть приветственное сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль.
    public static void myName(String txt) {
        System.out.println("Задание 4");
        System.out.println("Привет, " + txt + "!");
    }
}
