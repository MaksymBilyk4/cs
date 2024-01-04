package ppj23.task4;

public class Fruit {

    private String name;
    private double mass;

    public Fruit(String name) {
        this.name = name;
        this.mass = (Math.random() * 151) + 100;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                '}';
    }
}
