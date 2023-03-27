package org.tasks;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Map;

import static org.tasks.sort.Bubble;

public class WordBook {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("1408.txt");

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] allW = line.split(" ");
        Map<String, Integer> Dict = new HashMap<String, Integer>();

        for(String word : allW) {
            if (Dict.containsKey(word)){
                Dict.put(word, Dict.get(word) + 1);
            } else {
                Dict.put(word, 1);
            }
        }
        Integer[] num = Dict.values().toArray(new Integer[0]);
        num = Bubble(num);
        int u = 0;
        for (int i = num.length - 1; i >= 0; i--) {
            for (String word : Dict.keySet()){
                if (Dict.get(word) == num[i]){
                    System.out.println(word + "  - " + num[i]);
                    Dict.remove(word);
                    break;
                }
            }
        }
    }

}