package org.tasks;

import java.io.File;

public class Transport implements Command {

    @Override
    public String Execute(String CurPath, String[] inp) {
        if (inp.length > 1) {
            boolean trAccepted = false;
            File ficF = new File(CurPath);
            File[] allP = ficF.listFiles();
            String dir = inp[1];
            for (int i = 2; i < inp.length; i++){
                dir += " ";
                dir += inp[i];
            }
            System.out.println(dir);
            for (int i = 0; i < allP.length; i++) {
                if (allP[i].isDirectory()){
                    String[] PtP = allP[i].toString().split("\\\\");
                    System.out.println(PtP[PtP.length - 1]);
                    if (dir == PtP[PtP.length - 1]) {
                        trAccepted = true;
                        System.out.println("Norm");
                    }
                }
            }
            if (trAccepted) {
                CurPath = CurPath + inp[1] + "\\\\";
                System.out.println("Новый путь: " + CurPath);
            } else {
                System.out.println("Нет такой директории");
            }
        } else {
            System.out.println("Укажите директорию");
        }
        return CurPath;
    }
}
