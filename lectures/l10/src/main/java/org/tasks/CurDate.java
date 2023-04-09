package org.tasks;
import java.util.Date;

public class CurDate implements Command{

    @Override
    public void Execute(String CurPath) {
        Date d = new Date();
        System.out.println(d);
    }

}
