package files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FIleReaderEx {

    public static void main(String[] args) {


        try {
            FileReader fileReader = new FileReader("test2.txt");

            int character;

            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("File read.");

            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
