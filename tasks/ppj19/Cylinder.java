package ppj19;

public class Cylinder {

    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public void show() {
        double baseArea = Math.PI * Math.pow(this.radius, 2);
        double volume = Math.PI * Math.pow(this.radius, 2) * height;

        System.out.println("Cylinder -> {" + " base area: " + baseArea + ", volume " + volume + " }");
    }
}
