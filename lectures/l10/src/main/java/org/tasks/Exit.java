package org.tasks;

public class Exit implements Command{
    @Override
    public void Execute(String CurPath) {
        System.out.println("Выход ->");
    }
}
