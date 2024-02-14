package niotry;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufferChannelEx {

    public static void main(String[] args) {

        try {
            RandomAccessFile file = new RandomAccessFile("eng.txt", "rw");

            FileChannel channel = file.getChannel();

            ByteBuffer buffer = ByteBuffer.allocate(15);
            StringBuilder builder = new StringBuilder();


            int byteRead = channel.read(buffer);
            while (byteRead > 0) {
                System.out.println("Read -> " + byteRead);

                buffer.flip();

                while (buffer.hasRemaining()) {
                    builder.append((char) buffer.get());
                }

                buffer.clear();
                byteRead = channel.read(buffer);
            }

            System.out.println(builder);

            String text = "\nNew additional text.\nGod, I am sorry for bad thoughts\nThank you, I love you";

            // EX 1
//            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
//            buffer2.put(text.getBytes());
//            buffer2.flip();
//
//            channel.write(buffer2);
//
//            System.out.println("done");

            // EX 2
            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer2);

            file.close();
            channel.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
