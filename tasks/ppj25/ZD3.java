package ppj25;

import java.io.FileReader;
import java.io.IOException;

public class ZD3 {

    public static void main(String[] args) {

        try {

            FileReader fileReader = new FileReader("task3_ppj.txt");

            int numbersSum = 0;
            int character;
            while ((character = fileReader.read()) != -1) {
                if (!Character.isSpaceChar((char) character)) {
                    numbersSum += Integer.parseInt(String.valueOf((char) character));
                }
            }

            System.out.println("Sum of numbers from file ---> " + numbersSum);
            fileReader.close();

        }catch (IOException exception) {
            exception.printStackTrace();
        }

    }

}
