package files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

    public static void main(String[] args) {

        try {
            String str = "hellow world, bla bla bla\n" +
                    "text text text text text text\n" +
                    "separated super 10000000\n";
            String s = "INPUT IN EXISTING FILE";
            FileWriter fileWriter = new FileWriter("test2.txt", true);

//            for (int i = 0; i < str.length(); i++) {
//                fileWriter.write(str.charAt(i));
//            }
//
            fileWriter.write(s);
//


            System.out.println("File wrote.");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
