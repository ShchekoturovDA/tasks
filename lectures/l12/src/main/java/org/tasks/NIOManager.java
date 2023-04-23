package org.tasks;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.FileChannel;
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
        while (buf.hasRemaining()) {
            content += (char)buf.get();
        }
        return content;
    }

    @Override
    public void WriteFile(String name, String Words) throws IOException {
        ByteBuffer buf = ByteBuffer.allocate(Words.length());
        byte[] Wb = Words.getBytes();

        for(int i = 0; i < Wb.length; i++) {
            buf.put(Wb[i]);
        }
        buf.flip();
        RandomAccessFile wf = new RandomAccessFile(name, "rw");
        FileChannel chan = wf.getChannel();
        chan.write(buf);
        chan.close();
    }
}
