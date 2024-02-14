package files;

import java.io.*;

public class BufferedEx {

    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("test2.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test3.txt"));

//            int character;
//            while ((character = bufferedReader.read()) != -1) {
//                bufferedWriter.write(character);
//            }
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.write("\n");
            }

            System.out.println("Read and wrote");

            System.out.println("Read and wrote.");

            bufferedReader.close();
            bufferedWriter.close();

        }catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
