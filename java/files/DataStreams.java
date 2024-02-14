package files;

import java.io.*;

public class DataStreams {

    public static void main(String[] args) {
        try {

            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("test_binary.bin"));
            DataInputStream inputStream = new DataInputStream(new FileInputStream("test_binary.bin"));

            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeShort(100);
            outputStream.writeLong(1_000_000);
            outputStream.writeDouble(3.14);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readDouble());

            outputStream.close();
            inputStream.close();

        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
