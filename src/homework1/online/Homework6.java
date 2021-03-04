import java.io.*;

public class Homework6 {
  //  private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        createFiles();
        uniteText(new String[]{"Part1.txt", "Part2.txt"}, "Unite.txt");
        searchWord("Part2.txt", "qwert");
    }

  // 1. Создать 2 текстовых файла, примерно по 50-100 символов в каждом (особого значения не имеет);
    public static void createFiles() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Part1.txt");
            PrintStream ps1 = new PrintStream(fileOutputStream);
            ps1.print("His ignorance was as remarkable as his knowledge. Of contemporary literature, philosophy and politics he appeared to know nothing. ");
            ps1.close();
            fileOutputStream.flush();
            fileOutputStream.close();

            FileOutputStream fileOutputStream2 = new FileOutputStream("Part2.txt");
            PrintStream ps2 = new PrintStream(fileOutputStream2);
            ps2.println("My surprise reached a climax, however, when I found incidentally that he was ignorant of the Copernican Theory and of the composition of the Solar System.");
            ps2.close();
            fileOutputStream2.flush();
            fileOutputStream2.close();

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    // 2. Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
    public static void uniteText(String[] names, String destinationName){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(destinationName);
            for (String name: names){
                FileInputStream fileInputStream = new FileInputStream(name);
                int i;
                do {
                    i = fileInputStream.read();
                    if(i != -1){
                        fileOutputStream.write(i);
                        System.out.print((char)i);
                    }
                }while (i != -1);

            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }


    // 3. Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
    public static void searchWord(String fileName, String word) {
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            int data;
            int index = 0;
            byte[] wordBytes = word.getBytes();
            do {
                data = fileInputStream.read();
                if (wordBytes[index] == data) {
                    index++;
                    if (index == wordBytes.length) {
                        System.out.println("Слово найдено");
                        break;
                        }
                    } else {
                        index = 0;
                    }
            } while (data != -1);
            System.out.println("Слово не найдено");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}