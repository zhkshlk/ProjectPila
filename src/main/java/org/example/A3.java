package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class A3 {
    public A3() throws FileNotFoundException {
        FileReader file = new FileReader("C:/Users/user/Desktop/Metalabs_Ultimate/ProjectPila/a3.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}
