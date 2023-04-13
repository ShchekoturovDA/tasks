package org.tasks;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface FileWork {

    public void MakeFile(String name) throws IOException;
    public char[] ReadFile(String name, char[] where) throws IOException;
    public void WriteFile(String name, String Words) throws IOException;
}
