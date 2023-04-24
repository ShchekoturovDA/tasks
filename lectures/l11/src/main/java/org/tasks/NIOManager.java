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
    public String ReadFile(String name) throws IOException{
        FileChannel chan = (FileChannel) Files.newByteChannel(Path.of(name));
        ByteBuffer buf = ByteBuffer.allocate((int) Files.size(Path.of(name)));
        chan.read(buf);
        chan.close();
        buf.flip();
        String cod = new String(buf.array(), StandardCharsets.UTF_8);
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
