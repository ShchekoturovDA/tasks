import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Какую букву я загадал?");
        int zag = (int)(Math.random()*((90-65)+1))+65;
        char ch = in.next().charAt(0);
        while ((int)ch != zag && (int)ch != zag + 32 && ch != '0') {
            if ((int)ch > zag && ((int)ch - 32 > zag || (int)ch < 91)){
                System.out.println("ВЫСОКО!");
            } else {
                System.out.println("низко!");
            }
            ch = in.next().charAt(0);
        }
        System.out.printf("Угадал!");
    }
}