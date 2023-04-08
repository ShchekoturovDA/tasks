package org.tasks;

public class Exit implements Command{
    @Override
    public void Execute() {
        System.out.println("Выход ->");
    }
}
