public class Horse extends Animal{

    public Horse(String name){
            super(name);
            this.name = name;
        }

            @Override
            void run(int length) {
                int runLength = 1500;
                if ((length > 0) && (length <= runLength)) System.out.println(name + " пробежал!");
            }

            @Override
            void swim(int length) {
                int swimLength = 100;
                if ((length > 0) && (length <= swimLength)) System.out.println(name + " проплыл " + length + "м");
            }

            @Override
            void jump(double height) {
                double jumpHeight = 3.0;
                if ((height > 0) && (height <= jumpHeight)) System.out.println(name + " прыгнул!");
            }
}
