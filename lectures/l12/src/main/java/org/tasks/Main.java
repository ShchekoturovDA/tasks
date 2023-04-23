package org.tasks;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String Input = scan.nextLine();
        String file1 = scan.nextLine();
        String file2 = scan.nextLine();
        IOManager io = new IOManager();
        NIOManager nio = new NIOManager();

        scan.close();
        io.MakeFile(file1);
        io.WriteFile(file1, Input);
        System.out.println(io.ReadFile(file1));
        nio.MakeFile(file2);
        nio.WriteFile(file2, Input);
        System.out.println(nio.ReadFile(file2));

    }
}