package org.tasks;

public class sort {

    public static Integer[] Bubble(Integer[] arr) {
        Integer l;
        for (int i = 1; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= i; j--) {
                if (arr[j] > arr[j - 1]) {
                    l = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = l;
                }
            }
        }
        return arr;
    }

}
