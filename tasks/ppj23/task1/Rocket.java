package ppj23.task1;

public class Rocket {

    private String name;
    private int weightFuel;

    public Rocket(String name) {
        this.weightFuel = 0;
        this.name = name;
    }

    // zatankuj
    public void refuel() {
        this.weightFuel += (int) (Math.random() * 1501);
    }

    public void start() throws Exception {
        if (this.weightFuel < 1000) throw new Exception("Start canceled - not enough fuel");

        System.out.println("Rocket is starting...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeightFuel() {
        return weightFuel;
    }

    public void setWeightFuel(int weightFuel) {
        this.weightFuel = weightFuel;
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "name='" + name + '\'' +
                ", weightFuel=" + weightFuel +
                '}';
    }
}
