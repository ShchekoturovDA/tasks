package org.tasks;

import java.util.Map;

public class Animal {
    private String title;
    private boolean isAvailable;
    private boolean isSold;
    private Map<String, String> photosMap;

    @Override
    public String toString() {
        String animal = "Животное вида: " + title;
        if (isAvailable) {
            animal += " продаётся.";
        } else {
            animal += " продано.";
        }
        animal += '\n';
        for (photosMap.containsValue(it))
        return animal;
    }
}
