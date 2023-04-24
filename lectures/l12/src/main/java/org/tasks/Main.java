package org.tasks;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Photo p1 = new Photo("A Cat IN A Hat", "https://kitthouse.ru/645/815");
        Photo p2 = new Photo("Боров на прогулке", "https://kitthouse.ru/213/746");
        List<Photo> nph = new ArrayList<Photo>();
        nph.add(p1);
        nph.add(p2);
        Pet cat = new Pet("Боров", Status.AVAILABLE, nph);
        TransformPets TP = new TransformPets();
        System.out.println(TP.PToA(cat));
        Pet pes = new Pet("Джек", Status.SOLD, List.of(new Photo("Котонеприязнь", "https://pesiya_obitel.ru/127"), new Photo("Понурый Джек", "https://pesiya_obitel.ru/61")));
        System.out.println(TP.PToA(pes));
    }
}