package org.tasks;

import java.io.File;

public class Cats implements Command {
    public Cats() {}

    @Override
    public String Execute(String CurPath, String[] inp) {
        if (inp.length != 1) {
            System.out.println("Лишние символы");
        } else {
            File ficF = new File(CurPath);
            File[] allP = ficF.listFiles();
            for (int i = 0; i < allP.length; i++) {
                if (allP[i].isDirectory()){
                    String[] PtP = allP[i].toString().split("\\\\");
                    System.out.println(PtP[PtP.length - 1]);
                }
            }
        }

        return CurPath;
    }
}
