package org.example;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
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
}
