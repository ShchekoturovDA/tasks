package org.tasks;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        IOManager io = new IOManager();
        NIOManager nio = new NIOManager();

        String Input = scan.nextLine();
        String file1 = scan.nextLine();
        String file2 = scan.nextLine();
        scan.close();
        io.MakeFile(file1);
        io.WriteFile(file1, Input);
        Output = io.ReadFile(file1, Output);
        System.out.println(SOut);

    }
}