package org.tasks;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.tasks.Paint.RESET;


public class Main {



    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Notification notify = new Notification();
//        notify.out();
        printnotif(new Notification());
    }

    public static void printnotif(Notification note) throws InvocationTargetException, IllegalAccessException {
        for (Method meth : note.getClass().getDeclaredMethods()) {
            Paint exec = meth.getAnnotation(Paint.class);
            if (exec != null) {
                System.out.println(exec.color() + exec.style() + meth.invoke(note) + exec.style() + exec.color());
            } else {
                exec = note.getClass().getAnnotation(Paint.class);
                if (exec != null) {
                    System.out.println(exec.color() + exec.style() + meth.invoke(note) + exec.style() + RESET);
                }
            }
        }
    }
}


