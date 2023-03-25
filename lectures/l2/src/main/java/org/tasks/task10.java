import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        System.out.printf("Введите десятичное число ");
        Scanner in = new Scanner(System.in);
        int ch = in.nextInt();
        String rch = "";
        while (ch / 100 > 0) {
            rch += "С";
            ch -= 100;
        }
        if (ch / 10 == 9) {
            rch += "XC";
            ch -= 90;
        } else if (ch / 10 > 4) {
            rch += "L";
            ch -= 50;
        } else if (ch / 10 == 4) {
            rch += "XL";
            ch -= 40;
        }
        while (ch / 10 > 0) {
            rch += "X";
            ch -= 10;
        }
        if (ch == 9) {
            rch += "IX";
            ch -= 9;
        } else if (ch > 4) {
            rch += "V";
            ch -= 5;
        } else if (ch == 4) {
            rch += "IV";
            ch -= 4;
        }
        while (ch > 0) {
            rch += "I";
            ch -= 1;
        }
        System.out.printf("Римская запись %s", rch);


    }
}