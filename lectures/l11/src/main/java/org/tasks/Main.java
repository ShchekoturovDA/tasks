package org.tasks;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку:");
        String Input = scan.nextLine();
        System.out.println("Название файла для сохранения с IO");
        String file1 = scan.nextLine();
        System.out.println("Название файла для сохранения с NIO");
        String file2 = scan.nextLine();
        IOManager io = new IOManager();
        NIOManager nio = new NIOManager();

        scan.close();
        io.MakeFile(file1);
        io.WriteFile(file1, Input);
        System.out.println("Результат с IO: ");
        System.out.println(io.ReadFile(file1));
        nio.MakeFile(file2);
        nio.WriteFile(file2, Input);
        System.out.println("Результат с NIO: ");
        System.out.println(nio.ReadFile(file2));

    }
}