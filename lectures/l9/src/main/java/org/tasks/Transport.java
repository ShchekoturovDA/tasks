package org.tasks;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Transport implements Command {

    @Override
    public String Execute(String CurPath, String[] inp) {
        if (inp.length == 2) {
            boolean EndIt = false;
            Path dp = null;
            try {
                dp = Paths.get(inp[1]);

            } catch (InvalidPathException e) {
                System.out.println("Неприемлемый путь");
                EndIt = true;
            }
            if (!EndIt) {
                File ficF = new File(CurPath);
                File[] allP = ficF.listFiles();
                String dir = inp[1];
                if (Files.exists(dp)) {
                    CurPath = dir + "\\";
                    System.out.println("Новый путь: " + CurPath);
                } else {
                    String our = CurPath + dir;
                    Path oF = null;
                    try {
                        oF = Paths.get(our);

                    } catch (InvalidPathException e) {
                        System.out.println("Неприемлемый путь");
                        EndIt = true;
                    }
                    if (!EndIt) {
                        if (Files.exists(oF)) {
                            CurPath = CurPath + dir + "\\";
                            System.out.println("Новый путь: " + CurPath);
                        } else {
                            System.out.println("Нет такой директории");
                        }

                    }
                }
            }
        } else {
            System.out.println("Укажите директорию");
        }
        return CurPath;
    }
}
