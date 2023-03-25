import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        System.out.print("Сколько чисел из последовательности фиббоначи? ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long a = 1;
        long b = 0;
        for (int i = 1; i <= n; i++) {
            if (a > b) {
                System.out.printf("%d ", a);
                b += a;
            } else {
                System.out.printf("%d ", b);
                a+= b;
            }
        }
    }
}