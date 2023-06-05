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


    public String question() {
        return "2 на 2 равно 4 ?";
    }

}

