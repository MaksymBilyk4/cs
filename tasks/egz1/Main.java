package egz1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String mail = "username@gmail.com";

        Pattern pattern = Pattern.compile("[A-Za-z]+@(gmail)\\.(com)");
        Matcher matcher = pattern.matcher(mail);

        System.out.println(matcher.matches());


//        for (int i = 0; i < 3; i++) {
//            switch (i) {
//                case 0:
//                    System.out.println("0");
//                    break;
//                case 1:
//                    System.out.println("1");
//                    break;
//                case 2:
//                    System.out.println("2");
//                    break;
//                default:
//                    System.out.println("default");
//
//            }
//        }

        try {
            FileOutputStream writer = new FileOutputStream("a.bin");

            int[] arr = {0b00000001, 555, 03, 0x4};
            System.out.println(Arrays.toString(arr));

            System.out.println(Integer.toBinaryString(arr[1]));

            for (int i = 0; i < arr.length; i++) {
                writer.write(arr[i]);
            }

            writer.close();
            System.out.println("Wrote to file...");
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        try {
            FileInputStream reader = new FileInputStream("a.bin");

            int bytes;

//            while ((bytes = reader.read()) != -1) {
//                System.out.println(reader.read());
//            }
            for (int i = 0; i < 4; i++) {
                System.out.print(reader.read() + " ");
            }

            System.out.println();
//            reader.reset();
            System.out.println(Arrays.toString(reader.readAllBytes()));

            reader.close();

            System.out.println("Read from file..");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
