package ppj22;

import java.util.Arrays;

public class Komorka extends Telefon {

    private String[] lastTenCalls;

    public Komorka(String color) {
        super(color);
        this.lastTenCalls = new String[10];
    }

    @Override
    public void call(String number) {
        this.lastTenCalls = queueSimulation(this.lastTenCalls, number);
    }

    @Override
    public void connectionHistory() {
        if (this.lastTenCalls[0] == null) {
            System.out.println("No connection history. It is empty (Komorka.java)");
            return;
        }

        System.out.println("Connection history: (Komorka.java)");
        for (int i = 0; i < this.lastTenCalls.length; i++) {
            if (this.lastTenCalls[i] == null) break;
            System.out.println((i + 1) + ". " + this.lastTenCalls[i]);
        }
    }

    // first in last out
    public static String[] queueSimulation(String[] arr, String number) {
        String[] copy = new String[10];
        copy[0] = number;

        for (int i = 1; i < arr.length; i++) {
            copy[i] = arr[i - 1];
        }

        return copy;
    }

    public String[] getLastTenCalls() {
        return lastTenCalls;
    }

    public void setLastTenCalls(String[] lastTenCalls) {
        this.lastTenCalls = lastTenCalls;
    }

    @Override
    public String toString() {
        return "Komorka{" +
                "lastTenCalls=" + Arrays.toString(lastTenCalls) +
                '}';
    }
}
