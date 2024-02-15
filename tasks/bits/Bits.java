package bits;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Bits {

    public static void main(String[] args) {
//
//        System.out.println("ASCII: 65 - 91. 97 - 123");
//        for (int i = 65; i < 91; i++) {
//            System.out.print((char) i);
//        }
//        System.out.println();
//        for (int i = 97; i < 123; i++) {
//            System.out.print((char) i);
//        }

        System.out.println();

        try {
            FileOutputStream fos = new FileOutputStream("b.bin");

            int[] val = {0b1111_1111, 0401, 517, 0x204};

            fos.write(0b1111_1111);
            fos.write(0b0000_1111);
            fos.write(517);
            fos.write(0x204);

            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fos = new FileInputStream("b.bin");

//            System.out.println(Arrays.toString(fos.readAllBytes()));
            System.out.println(fos.read());
            System.out.println(fos.read());
            System.out.println(fos.read());
            System.out.println(fos.read());

            fos.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }


//        int x = 342;
//        System.out.println(Integer.toBinaryString(x));
//        System.out.println(Integer.toBinaryString(~x));
//        System.out.println(~x);
//        System.out.println(Integer.toBinaryString(255));

//        Car car = new Car(10);
//        Car car1 = new Car(20);
//        Vehicle vehicle = new Vehicle(10);

//        System.out.println(car1.getSeatsCount());
//        System.out.println(Car.getCount());
    }

}


class Vehicle {

    private int seatsCount;

    public Vehicle(int seatsCount) {
        this.seatsCount = seatsCount;
    }


    public int getSeatsCount() {
        return seatsCount;
    }

}


class Car extends Vehicle {

    private static int count;

    public Car(int seatsCount) {
        super(seatsCount);
        count++;
    }

    public static int getCount() {
        return count;
    }

}