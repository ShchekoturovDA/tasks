package org.tasks;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface FileWork {

    public void MakeFile(String name) throws IOException;
    public String ReadFile(String name, String content) throws IOException;
    public void WriteFile(String name, String Words) throws IOException;
}
