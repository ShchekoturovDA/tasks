package org.tasks;
import java.util.Date;

public class Time implements Command{

    @Override
    public String Execute(String CurPath, String[] inp) {
        if (inp.length != 1) {
            System.out.println("Лишние символы");
        } else {

            Date d = new Date();
            System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
        }
        return CurPath;
    }
}
