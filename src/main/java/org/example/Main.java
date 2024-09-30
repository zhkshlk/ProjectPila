package org.example;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

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


        Scanner sc = new Scanner(System.in);
        try {
            Map<Integer, Game> map = new HashMap<>();
            map.put(1, new A11());
            map.put(2, new WordGuessingGame());
            map.put(3, new FindNumber());
            String variant = sc.next();
            if (variant.equals("1")) {
                new A();
                for(int i = 0; i < map.size(); i++){
                    System.out.println("Выберите вариант");
                    int num = sc.nextInt();
                    Game o = map.get(num);
                    if (o != null){
                        o.play();
                        map.remove(num);
                    }
                    if (o == null){
                        System.out.println("Вы уже прошли эту игру");
                    }
                    if (map.isEmpty()){
                        System.out.println("Вы прошли все игры");
                    }
                }

            }
        }
        catch (NoSuchElementException e) {
            e.getStackTrace();
        }
    }
}
