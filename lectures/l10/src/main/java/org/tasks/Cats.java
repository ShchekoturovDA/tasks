package org.tasks;

import java.util.HashMap;
import java.util.List;

public class Cats implements Command {
    HashMap<String, List<String>> Papk;

    public Cats() {}

    @Override
    public void Execute(String CurPath) {
        String[] PbP = CurPath.split("/");
        System.out.println(Papk.get(PbP[PbP.length - 1]));
    }
}
