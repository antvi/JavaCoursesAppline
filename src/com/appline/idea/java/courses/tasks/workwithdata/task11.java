package com.appline.idea.java.courses.tasks.workwithdata;

import java.util.Scanner;

/**
 * Задача №11_Работа с данными
 * <p>
 * Напишите программу:
 * <p>
 * Ввести первое  число с клавиатуры и записать его в строковую переменную.
 * <p>
 * Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
 * <p>
 * Сравнить 2 числа и вывести большее на экран .
 * <p>
 * Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
 */

public class task11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число в строковую переменную");
        String str = scanner.next();
        System.out.println("Введите второе число в целочисленную переменную");
        int k = scanner.nextInt();

        Integer s = Integer.parseInt(str);

        if (k > s) {
            System.out.println("Большее число: " + k);

        } else {
            System.out.println("Большее число: " + s);
        }

        double k1 = k;
        double s1 = s;

        if (k1 < s1) {
            System.out.println("Меньшее число: " + k1);

        } else {
            System.out.println("Меньшее число: " + s1);
        }
    }
}
