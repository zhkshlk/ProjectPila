package org.example;

import java.io.*;
import java.util.Scanner;

public class Run implements Runnable {
    Scanner sc = new Scanner(System.in);

    @Override
    public void run () {
            try {
                String variant = sc.nextLine();
                if (variant.contains("а")) {
                    new A();
                    if (sc.hasNextInt()) {
                    int num = sc.nextInt();
                    if (num == 1) {
                        new A1();
                        if (sc.hasNextInt()) {
                            int number = sc.nextInt();
                            if (number == 1) {
                                new A11();
                                int answer = sc.nextInt();
                                if (answer == 36) {
                                    System.out.println("Вы нашли правильный ответ");
                                }
                                else {
                                    System.out.println("Вы не правильно отгадали");
                                }
                            }
                        }
                    }

                    }
                }
                else if (variant.contains("б")) {
                    new B();
                    if (sc.hasNextInt()) {
                        int num = sc.nextInt();
                        if (num == 1) {
                            new Thread(this).start();
                            this.run();
                                FileReader file = new FileReader("C:/Users/user/Desktop/Metalabs_Ultimate/ProjectPila/a.txt");
                                Scanner sc = new Scanner(file);
                                while (sc.hasNextLine()) {
                                    System.out.println(sc.nextLine());
                                }
                        }
                    }
                }
            } catch (NullPointerException | IOException e) {
                e.printStackTrace();
            }
    }
}
