package ppj25;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ZD2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input amount of files to write in: ");
        int fileAmount = scanner.nextInt();
        FileWriter fileWriter = null;

        try {
            int starter = 1;
            while (starter <= fileAmount) {
                String fileName = "data" + starter;
                fileWriter = new FileWriter(fileName);
                fileWriter.write(String.valueOf((int) (Math.random() * 10001)));
                fileWriter.close();
                starter++;
            }

        }catch (IOException e) {
            e.printStackTrace();
        }

    }

}
