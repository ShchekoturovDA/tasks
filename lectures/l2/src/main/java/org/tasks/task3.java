import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число полиндром ");
        String poly = in.next();
        int i1 = 0;
        Boolean ispoly = true;
        int i2 = poly.length() - 1;
        while (i1 < i2) {
            if (poly.charAt(i1) != poly.charAt(i2)) {
                ispoly = false;
            }
            i1 ++;
            i2 --;
        }

        if (ispoly) {
            System.out.print("Полиндром");
        } else {
            System.out.print("Не полиндром");
        }

    }
}