import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        System.out.print("Введите силу тяжести на Земле ");
        Scanner in = new Scanner(System.in);
        float weight = in.nextFloat();
        weight *= 0.17;
        System.out.printf("Сила тяжести на Луне равна %f", weight);
    }
}