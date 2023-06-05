package org.tasks;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inpcom = scan.nextLine();
        //List<String> inplist = List.of(inpcom.split(" "));
        Map<String, String> inpmap
                = Arrays.stream(inpcom.split("-"))
                .filter(x -> x != "")
                .collect(Collectors.toMap(
                        value
                                -> '-' + value.split(" ")[0],
                        value ->  value.split(" ", 2)[1])
                );
        System.out.println(Arrays.toString(inpcom.split("-")));
        inpcom =
                inpmap.entrySet().stream()
                .map(key -> key.getKey() + " " + inpmap.get(key.getKey()) + " ")
                        .collect(Collectors.joining(""));
        System.out.println(inpmap);
        System.out.println(inpcom);
    }
}