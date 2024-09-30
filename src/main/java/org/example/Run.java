package org.example;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Run implements Runnable {
    Scanner sc = new Scanner(System.in);
    Map<Integer, Game> map = new HashMap<>();

    public void run() {
        try {
            map.put(1, new A11());
            map.put(2, new WordGuessingGame());
            map.put(3, new FindNumber());
            String variant = sc.next();
            if (variant.equals("1")) {
                new A();
                System.out.println("------------------------------------------------");
                Game o = map.get(sc.nextInt());
                o.play();
            }
        } catch (NullPointerException | IOException e) {
            e.printStackTrace();
        }
    }
}
