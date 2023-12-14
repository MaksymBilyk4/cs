package ppj19;

public class Square {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public void show() {
        int square = this.side * this.side;

        System.out.println("Square -> { " + "side: " + side + ". Square: " + square + " }");
    }
}
