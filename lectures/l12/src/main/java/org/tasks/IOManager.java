package org.tasks;

import java.io.*;

public class IOManager implements FileWork {
    IOManager(){}

    @Override
    public void MakeFile(String name) throws IOException {
        File f = new File(name);
        f.createNewFile();
    }

    @Override
    public char[] ReadFile(String name, char[] where) throws IOException {
        FileReader ReadIt = new FileReader(name);
        ReadIt.read(where);
        ReadIt.close();
        return where;
    }

    @Override
    public void WriteFile(String name, String Words) throws IOException {
        FileWriter WriteTo = new FileWriter(name);
        WriteTo.write(Words);
        WriteTo.close();
    }
}
