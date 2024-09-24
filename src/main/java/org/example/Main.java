package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/user/Desktop/Metalabs_Ultimate/ProjectPila/Begin.txt");
        InputStream in = new FileInputStream(file);
        byte[] arr = new byte[in.available()];
        while (in.read(arr) != -1) {
            in.read(arr);
        }
        String s = new String(arr);
        System.out.println(s);
        in.close();
        Run run = new Run();
        new Thread(run).start();
        WordGuessingGame game =  new WordGuessingGame();
        game.miniGame();
    }
}
