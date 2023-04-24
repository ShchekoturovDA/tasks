package org.tasks;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface FileWork {

    public String ReadFile(String name) throws IOException;
    public void WriteFile(String name, String Words) throws IOException;
}
