public class Cat extends Animal {

    public Cat(String name){
            super(name);
            this.name = name;
        }

            @Override
            void run(int length) {
                int runLength = 200;
                if ((length > 0) && (length <= runLength)) System.out.println(name + " пробежал!");
            }
            @Override
            void swim(int length) {
                int swimLength = 0;
                if (length >= swimLength) System.out.println(name + " не умеет плавать");
                else System.out.println("Введите положительное значение");

            }
            @Override
            void jump(double height) {
                double jumpHeight = 2.0;
                if ((height > 0) && (height <= jumpHeight)) System.out.println(name + " прыгнул!");
            }

}
