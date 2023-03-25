import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.print("Введите число ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        System.out.printf("Сумма  цифр %d \n", s);
    }
}