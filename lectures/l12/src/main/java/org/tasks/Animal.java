package org.tasks;

import java.util.Map;

public class Animal {
    private String title;
    private boolean isAvailable;
    private boolean isSold;
    private Map<String, String> photosMap;

    @Override
    public String toString() {
        String animal = "Животное с кличкой: " + title;
        if (isAvailable) {
            animal += " продаётся.";
        } else {
            animal += " продано.";
        }
        animal += "\nФотографии:\n";
        for (String key : photosMap.keySet()) {
            animal += '"' + key + '"' + " по ссылке: " + photosMap.get(key) + '\n';
        }
        return animal;
    }
}
