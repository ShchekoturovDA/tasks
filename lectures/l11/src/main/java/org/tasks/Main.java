package org.tasks;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите числа для перемножения");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Multipl m = new Multipl();
        try {
            m.Mult(a, b);
        } catch (ErrMult Em) {
            System.out.println(Em.getMessage());
        } finally {
            System.out.println("Завершение работы");
        }
    }
}