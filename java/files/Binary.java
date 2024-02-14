package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binary {

    public static void main(String[] args) {

        try {
            FileInputStream inputStream = new FileInputStream("C:\\Users\\Max\\Downloads\\mObywatel_id.jpg");
            FileOutputStream outputStream = new FileOutputStream("mObywatel_id.jpg");

            int bytes;
            while ((bytes = inputStream.read()) != -1) {
                outputStream.write(bytes);
            }

            System.out.println("Read and done");
            inputStream.close();
            outputStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
