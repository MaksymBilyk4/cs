package ppj25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class ZD1 {

    public static void main(String[] args) {

        try {
            FileInputStream inputStream = new FileInputStream("zd1.txt");

            int content;
            while ((content = inputStream.read()) != -1) {
                System.out.println((char) inputStream.read());
            }

            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
