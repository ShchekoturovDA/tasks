package org.tasks;

import java.io.IOException;

public class NIOManager implements  FileWork {
    NIOManager(){}

    @Override
    public void MakeFile(String name) throws IOException{

    }

    @Override
    public char[] ReadFile(String name, char[] where) throws IOException{

        return where;
    }

    @Override
    public void WriteFile(String name, String Words) throws IOException {

    }
}
