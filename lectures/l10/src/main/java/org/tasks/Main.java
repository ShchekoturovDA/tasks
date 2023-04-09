package org.tasks;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Command> ComMap = new HashMap<String, Command>();
        CurDate d = new CurDate();
        ComMap.put("date", d);
        Time t = new Time();
        ComMap.put("time", t);
        Exit e = new Exit();
        ComMap.put("exit", e);
        String CurPath = "C:/";
        CurP c = new CurP();
        ComMap.put("pwd", c);
        String ExP = "";
        Cats AllP = new Cats();
        List<String> P1 = new ArrayList<String>();
        P1.add("")
        AllP.Papk.put("C:", );

        String test = new String();
        while (ComMap.get(test) != e) {
            System.out.print(ExP + '>');
            Scanner scan = new Scanner(System.in);
            String Curcom = scan.nextLine();
            if (ComMap.containsKey(Curcom)) {
                ComMap.get(Curcom).Execute(CurPath);
            } else {
                System.out.println("Команда '" + Curcom + "' не известна");
            }
            test = Curcom;
        }
    }
}