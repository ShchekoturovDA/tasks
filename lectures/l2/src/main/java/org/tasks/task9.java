import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a ");
        float a = in.nextFloat();
        System.out.print("Введите b ");
        float b = in.nextFloat();
        System.out.print("Введите c ");
        float c = in.nextFloat();
        float d = b * b - 4 * a * c;
        if (d >= 0) {
            float x1 = (-1 * b + (float)Math.sqrt(d)) / (2 * a);
            float x2 = (-1 * b - (float)Math.sqrt(d)) / (2 * a);
            System.out.printf("x1 = %f \n", x1);
            if (x2 != x1) {
                System.out.printf("x2 = %f \n", x2);
            }
        } else {
            System.out.print("Корней нет!");
        }
    }
}