package ppj22;

public class Telefon {

    private String color;

    public Telefon(String color) {
        this.color = color;
    }

    public void call(String number) {
        System.out.println("Call telephone number ---> " + number);
    }

    public void connectionHistory () {
        System.out.println("No connection history!!! (Telefon.java)");
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
