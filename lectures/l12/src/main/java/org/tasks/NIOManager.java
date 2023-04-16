package org.tasks;

import java.io.File;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class NIOManager implements  FileWork {
    NIOManager(int c){
        ByteBuffer buf = ByteBuffer.allocate(c);
    }

    @Override
    public void MakeFile(String name) throws IOException{
        File f = new File(name);
        f.createNewFile();
    }

    @Override
    public String ReadFile(String name, String content) throws IOException{

        return content;
    }

    @Override
    public void WriteFile(String name) throws IOException {
        File file = new File(name);
        while
    }
}
