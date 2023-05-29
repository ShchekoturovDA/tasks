package org.tasks;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.tasks.Paint.*;
import static org.tasks.style.*;

@Paint(style = arrow, color = BLUE)
public class Notification {
    @Paint(style = hash, color = RED)
    public String alarm() {
        return "Пора вставать!";
    }

    @Paint(style = press, color = GREEN)
    public String remind() {
        return "Нужно выгулять собаку";
    }

    @Paint(style = tilda, color = YELLOW)
    public String advert() {
        return "Лучшие блины у нас!, 8-495...";
    }

    @Paint(style = arrow, color = BLUE)
    public String question() {
        return "2 на 2 равно 4 ?";
    }

    public void out() throws InvocationTargetException, IllegalAccessException {
        for(Method meth : this.getClass().getMethods()){
            Paint exec = meth.getAnnotation(Paint.class);
            if (exec != null) {
                System.out.println(exec.color() + exec.style() + meth.invoke(this) + exec.style() + exec.color());
            }
        }
    }

}
