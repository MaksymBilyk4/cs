package files;

import java.io.FileReader;
import java.io.IOException;

public class TryWithRes {

    public static void main(String[] args) {

        // automatically close IO stream
        try (FileReader fileReader = new FileReader("test2.txt")){

            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }

            System.out.println();
            System.out.println("File read with try-resources block");

        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
