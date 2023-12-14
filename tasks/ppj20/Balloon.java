package ppj20;

public class Balloon {

    // 0.007 - 6g
    private final double volume;

    public Balloon() {
        this.volume = Math.round((0.005 + Math.random() * (0.009 - 0.005)) * 1000.0) / 1000.0;
    }


    public double getLoad() {
        return Math.round(((this.volume *  6.00) / 0.007) * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "[ volume -> " + volume +
                ", max grams -> " + this.getLoad() + " ]";
    }
}
