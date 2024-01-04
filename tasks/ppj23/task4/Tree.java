package ppj23.task4;

public class Tree {

    public Tree() {}

    public static Fruit pickFruit() {
        int randomFruit = (int) ((Math.random() * 3) + 1);

        if (randomFruit == 1) return new Apple();
        if (randomFruit == 2) return new Pear();

        return new Orange();
    }

}
