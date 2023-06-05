package org.tasks;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inpcom = scan.nextLine();
        List<String> inplist = List.of(inpcom.split(" "));
        Map<String, String> inpmap = new HashMap<String, String>();
        Set <String> inpset = new HashSet<String>();
        inplist.stream()
                .filter(x -> x.charAt(0) == '-')
                .collect(Collectors.toSet());
         = inplist;
    }
}