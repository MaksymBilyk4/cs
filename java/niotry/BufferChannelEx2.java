package niotry;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufferChannelEx2 {

    public static void main(String[] args) {

        try {

            RandomAccessFile file = new RandomAccessFile("learn.txt", "r");
            FileChannel channel = file.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(5);
            // channel reads from file and writes to buffer
            channel.read(buffer);
            buffer.flip();

            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());

            // removes pointer to zero
            buffer.rewind();
            System.out.println((char) buffer.get());

            System.out.println("---------------");
            buffer.compact();
            channel.read(buffer);
            buffer.flip();

            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }

            System.out.println("--------------------");
            buffer.clear();

            channel.read(buffer);
            buffer.flip();
            System.out.println((char) buffer.get());
            buffer.mark();
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            buffer.reset();

            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }

        }catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }

}
