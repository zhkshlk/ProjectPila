package org.example;

import java.util.Scanner;

public class WordGuessingGame {
    String word = "java";
    StringBuilder guessed = new StringBuilder("_".repeat(word.length()));
    Scanner sc = new Scanner(System.in);
    int attempts = 10;

    public void miniGame() {
        while (attempts > 0 && guessed.indexOf("_") != -1) {
            System.out.println("Слово " + guessed);
            System.out.println("У вас осталось попыток: " + attempts);
            System.out.println("Введите букву: ");
            char guess = sc.next().charAt(0);

            if (word.indexOf(guess) != -1) {
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        guessed.setCharAt(i, guess);
                    }
                }
            }
            else {
                attempts--;
                System.out.println("Неверно!");
            }
        }
        if (guessed.indexOf("_") != -1) {
            System.out.println("Вы проиграли! Загаданное слово: " + word);
        }
        else {
            System.out.println("Поздравляю! Вы отгадали слово: " + word);
        }
        sc.close();
    }

}