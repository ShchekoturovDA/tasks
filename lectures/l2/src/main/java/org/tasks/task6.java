import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        System.out.print("Введите число ");
        Scanner in = new Scanner(System.in);
        float ch = in.nextFloat();
        float i = 2;
        while (i <= Math.sqrt(ch) && Math.round(ch) % Math.round(i) != 0) {
            i ++;
        }
        if (Math.round(ch) % Math.round(i) == 0 && i != ch) {
            System.out.print("Непростое");
        } else {
            System.out.print("Простое");
        }
    }
}