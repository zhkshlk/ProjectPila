package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class A1 {
    public A1() throws FileNotFoundException {
        FileReader file = new FileReader("C:/Users/user/Desktop/Metalabs_Ultimate/ProjectPila/a1.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }

    /* public static void variantsOfA () throws NullPointerException  {
        if (scanner.hasNextInt()) {
            scanner.nextLine().contains("1");
        }
        else if (scanner.hasNextLine()) {
            scanner.nextLine().contains("2");
        }
    } */
}
