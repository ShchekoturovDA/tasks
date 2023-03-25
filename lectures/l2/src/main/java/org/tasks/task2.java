import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a =  ");
        int a = in.nextInt();
        System.out.print("b =  ");
        int b = in.nextInt();
        System.out.printf("%d / %d = %d и %d в остатке\n", a, b, a/b, a%b);
    }
}