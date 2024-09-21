package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Run {
    Scanner sc = new Scanner(System.in);
    public void run () throws IOException {
        File file = new File("C:/Users/user/Desktop/Metalabs_Ultimate/ProjectPila/Begin.txt");
            InputStream in = new FileInputStream(file);
            byte[] arr = new byte[in.available()];
            while (in.read(arr) != -1) {
                in.read(arr);
            }
            String s = new String(arr);
            System.out.println(s);
            in.close();
            String varianA = sc.nextLine();
            if (varianA.contains("а")) {
                new A1();
            }
    }
}
