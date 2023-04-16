package org.tasks;

import java.io.*;
import java.util.Scanner;

public class IOManager implements FileWork {
    IOManager(){}

    @Override
    public void MakeFile(String name) throws IOException {
        File f = new File(name);
        f.createNewFile();
    }

    @Override
    public String ReadFile(String name, String content) throws IOException {
        File file = new File(name);
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()){
            content += scan.nextLine();
        }
        return content;
    }

    @Override
    public void WriteFile(String name, String Words) throws IOException {
        FileWriter WriteTo = new FileWriter(name);
        WriteTo.write(Words);
        WriteTo.close();
    }
}
