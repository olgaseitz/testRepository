public class BigDog extends Dog {

   // private final int runLength = 600;
   // private final int swimLength = 10;
   // private final double jumpHeight = 0.5;

    public BigDog(String name, int age){
        super(name, age);

    }

    @Override
    public void run(int length) {
        int runLength = 600;
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
