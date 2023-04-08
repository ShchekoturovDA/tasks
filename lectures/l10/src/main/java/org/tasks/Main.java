package org.tasks;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Command> ComMap = new HashMap<String, Command>();
        CurDate d = new CurDate();
        ComMap.put("date", d);
        Time t = new Time();
        ComMap.put("time", t);
        Exit e = new Exit();
        ComMap.put("exit", e);
        String test = new String();
        while (ComMap.get(test) != e) {
            System.out.print('>');
            Scanner scan = new Scanner(System.in);
            String Curcom = scan.nextLine();
            if (ComMap.containsKey(Curcom)) {
                ComMap.get(Curcom).Execute();
            } else {
                System.out.println("Комманда не известна");
            }
            test = Curcom;
        }
    }
}