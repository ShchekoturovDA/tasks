package org.tasks;
import java.util.Date;

public class Time implements Command{

    @Override
    public void Execute() {
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
    }
}
