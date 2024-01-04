package ppj23.task4;

public class Main {

    public static void main(String[] args) {

        try {
            getFruitsAndCalc();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static void getFruitsAndCalc() throws Exception {

        Fruit[] fruits = new Fruit[100];
        double grams = 0.00;
        int counter = 0;

        int apples = 0;
        int pears = 0;
        int oranges = 0;

        while (grams < 5000) {
            if (counter >= fruits.length) throw new Exception("Too many fruits. \nKilos: " + grams / 1000.0 + " Apples -> " + apples + " Pears -> " + pears + " Oranges -> " + oranges);
            Fruit randomFruit = Tree.pickFruit();

            if (randomFruit.getName().equals("Apple")) apples += 1;
            else if (randomFruit.getName().equals("Pear")) pears += 1;
            else oranges += 1;

            grams += randomFruit.getMass();
            fruits[counter] = randomFruit;
            counter++;
        }

        System.out.println("Reached -> " + grams / 1000.0 + " kg");
        System.out.println("Fruit count -> " + (apples + oranges + pears));
        System.out.println("Oranges -> " + oranges);
        System.out.println("Apples -> " + apples);
        System.out.println("Pears -> " + pears);

    }

}
