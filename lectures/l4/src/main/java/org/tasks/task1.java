import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Phone[] phones = new Phone[6];
        Phone p = new Phone("+79214578645", "Samsung", 19.5);
        phones[0] = p;
        p = new Phone();
        phones[1] = p;
        p = new Phone("+79335487615","Nokia");
        phones[2] = p;
        p.ReciveCall("Ivan");
        p = new Phone("+79548675428", "Huawei", 14.5);
        p.ReciveCall("Kim", p);
        phones[3] = p;
        p = new Phone("157846", "Samsung", 16.87);
        phones[4] = p;
        p = new Phone("458961", "Samsung", 15.45);
        phones[5] = p;
        p.SendMessage(phones);
        System.out.println(p);
    }
}