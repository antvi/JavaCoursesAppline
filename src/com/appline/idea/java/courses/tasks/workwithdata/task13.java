package com.appline.idea.java.courses.tasks.workwithdata;

import java.util.Scanner;

/**
 * Задача №13_ Работа с данными
 * <p>
 * Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами. Например: “I love java 8 Я люблю java 14 core1”. Выполните следующие действия:
 * <p>
 * Выведите слова, состоящие только из латиницы.
 * <p>
 * Выведите количество этих слов.
 */

public class task13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 'I love java 8 Я люблю java 14 core1'");
        String str = scanner.nextLine();
//        String str = "i love java 8 Я люблю java 14 core1 ";
        System.out.println(str);

        String[] words = str.split(" ");
        Integer count = 0;
        for (String word : words) {
            boolean onlyLatinAlphabet = word.matches("^[a-zA-Z]+$");
            if (onlyLatinAlphabet) {
                System.out.print(word + " ");
                count++;
            }
        }
        System.out.println("Количество латинских слов :" + count);
    }
}
