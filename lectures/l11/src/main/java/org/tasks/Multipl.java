package org.tasks;

public class Multipl {
    public int mult(int a, int b) throws OddException {
        if (a % 2 != 0 || b % 2 != 0) throw new OddException("Множитель нечётный");
        return a * b;
    }
}
