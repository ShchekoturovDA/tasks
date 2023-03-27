package org.tasks;

import java.util.Map;

public class RevMap {
    public static void main(String[] args) {
        Map m = Map.of("Jeff", 56, 25.98, 0, 84, "Rattlehead");
        Map rev = reverse(m);
        System.out.println(rev);
    }

    public static Map reverse(Map m) {
        Map rev = Map.of(m.values(), m.keySet());
        return  rev;
    }
}