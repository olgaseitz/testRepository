public class Dog extends Animal {

    int age;

    public Dog(String name, int age) {
        super(name);
        this.age = 0;
    }

    //   4. При попытке животного выполнить одно из этих действий, оно должно
            //   сообщить результат. (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')
            @Override
            public void run(int length) {
                int runLength = 400;
                if ((length > 0) && (length <= runLength)) System.out.println(name + " пробежал!");
            }

            @Override
            public void swim(int length) {
                int swimLength = 10;
                if ((length > 0) && (length <= swimLength)) System.out.println(name + " проплыл " + length + "м");
            }

            @Override
            public void jump(double height) {
                double jumpHeight = 0.5;
                if ((height > 0) && (height <= jumpHeight)) System.out.println(name + " прыгнул!");
            }
}
