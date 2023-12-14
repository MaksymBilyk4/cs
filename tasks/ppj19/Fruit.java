package ppj19;

public class Fruit {

    public String name;
    public double weight;

    public Fruit(String name) {
        this.name = name;
        this.weight = Math.round((Math.random() * 0.3 + 0.5) * 100.0) / 100.0;
    }

    public void show() {
        System.out.println("Fruit ---> {" + " name: " + this.name + ", weight: " + this.weight);
    }

}
