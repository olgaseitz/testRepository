public abstract class Animal {

    protected String name;
   /* private final int runLength = 0;
      private final int swimLength = 0;
      private final double jumpHeight = 0;*/

    public Animal(String name) {
        this.name = name;
    }

    //  2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
    //  В качестве параметра каждому методу передается величина, означающая или
    //  длину препятствия (для бега и плавания), или высоту (для прыжков).

        abstract void run(int length);
        abstract void swim(int length);
        abstract void jump(double height);


}
