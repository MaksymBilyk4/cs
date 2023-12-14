package ppj19;

public class PPJ19 {
    public static void main(String[] args) {

        // 1
        Person person = new Person();
        person.name = "Maksym";
        person.surname = "Bilyk";
        person.birthyear = 2006;

        // 2
        Fruit fruit = new Fruit("Banana");
        fruit.show();

        // 3
        Square square = new Square(10);
        square.show();

        // 4
        Cylinder cylinder = new Cylinder(2, 2);
        cylinder.show();
    }
}
