package org.tasks;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, Command> ComMap = new HashMap<String, Command>();
        CurDate d = new CurDate();
        ComMap.put("date", d);
        Time t = new Time();
        ComMap.put("time", t);
        Exit e = new Exit();
        ComMap.put("exit", e);
        String CurPath = "C:\\";
        CurP c = new CurP();
        ComMap.put("pwd", c);
        Cats cat = new Cats();
        ComMap.put("lws", cat);
        Transport cd = new Transport();
        ComMap.put("cd", cd);
        String ExP = "";
        Cats AllP = new Cats();
        List<String> P1 = new ArrayList<String>();

        String test = new String();
        while (ComMap.get(test) != e) {
            System.out.print(ExP + '>');
            Scanner scan = new Scanner(System.in);
            String ins = scan.nextLine();
            String[] Inp = ins.split(" ");
            if (ComMap.containsKey(Inp[0])) {
                CurPath = ComMap.get(Inp[0]).Execute(CurPath, Inp);
            } else {

                System.out.println("Команда '" + Inp[0] + "' не известна");
            }
            test = Inp[0];
        }

    }
}