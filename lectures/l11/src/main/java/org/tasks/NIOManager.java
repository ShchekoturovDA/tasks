package org.tasks;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class NIOManager implements  FileWork {

    @Override
    public void MakeFile(String name) throws IOException{
        Files.createFile(Path.of(name));

    }

    @Override
    public String ReadFile(String name) throws IOException{
        String content = "";
        FileChannel chan = (FileChannel) Files.newByteChannel(Path.of(name));
        ByteBuffer buf = ByteBuffer.allocate((int) Files.size(Path.of(name)));
        chan.read(buf);
        chan.close();
        buf.flip();
        byte[] codb = new byte[(int) Files.size(Path.of(name))];
        int i = 0;
        while (buf.hasRemaining()) {
            codb[i] = buf.get();
            i++;
        }
        String cod = new String(codb, StandardCharsets.UTF_8);
        return cod;
    }

    @Override
    public void WriteFile(String name, String Words) throws IOException {


        ByteBuffer buf = ByteBuffer.allocate(Words.getBytes(StandardCharsets.UTF_8).length);
        buf.put(Words.getBytes(StandardCharsets.UTF_8));
        buf.flip();
        RandomAccessFile wf = new RandomAccessFile(name, "rw");
        FileChannel chan = wf.getChannel();
        chan.write(buf);
        chan.close();
    }
}
