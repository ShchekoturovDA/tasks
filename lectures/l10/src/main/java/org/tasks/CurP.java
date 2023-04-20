package org.tasks;

public class CurP implements Command {

    @Override
    public String Execute(String CurPath, String[] inp) {
        if (inp.length != 1) {
            System.out.println("Лишние символы");
        } else {
            System.out.println(CurPath);
        }
        return CurPath;
    }
}
