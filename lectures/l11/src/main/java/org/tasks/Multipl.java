package org.tasks;

public class Multipl {
    public void Mult(int a, int b) throws ErrMult {
        if (a % 2 != 0 || b % 2 != 0) throw new ErrMult("Множитель нечётный");
        System.out.println(a * b);
    }
}
