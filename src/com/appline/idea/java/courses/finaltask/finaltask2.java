package com.appline.idea.java.courses.finaltask;

import java.util.Scanner;

/**
 * Итоговая задача №2
 * <p>
 * Напишите программу, которая позволит решить простое уравнение относительно x. Программа принимает на вход строку длиной 5 символов.  Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’. Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке. Нужно найти неизвестное.
 * <p>
 * Пример для теста работы программы:
 * <p>
 * Ввод: x+5=7
 * Вывод: 2
 * Ввод: 3-x=9
 * Вывод: -6
 * Ввод: 3-3=x
 * Вывод: 0
 */
public class finaltask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уравнение= ");
        String str = scanner.nextLine();

//        String str = "x-3=4";

        switch (str.charAt(1)) {
            case '+':
                if (str.charAt(0) == 'x') {
                    int a = Integer.parseInt(String.valueOf(str.charAt(2)));
                    int b = Integer.parseInt(String.valueOf(str.charAt(4)));
                    System.out.println("x = " + (b - a));
                    break;
                }
                if (str.charAt(2) == 'x') {
                    int a = Integer.parseInt(String.valueOf(str.charAt(0)));
                    int b = Integer.parseInt(String.valueOf(str.charAt(4)));
                    System.out.println("x = " + (b - a));
                    break;
                }
                if (str.charAt(4) == 'x') {
                    int a = Integer.parseInt(String.valueOf(str.charAt(2)));
                    int b = Integer.parseInt(String.valueOf(str.charAt(0)));
                    System.out.println("x = " + (b + a));
                    break;
                }

            case '-':
                if (str.charAt(0) == 'x') {
                    int a = Integer.parseInt(String.valueOf(str.charAt(2)));
                    int b = Integer.parseInt(String.valueOf(str.charAt(4)));
                    System.out.println("x = " + (b + a));
                    break;
                }
                if (str.charAt(2) == 'x') {
                    int a = Integer.parseInt(String.valueOf(str.charAt(0)));
                    int b = Integer.parseInt(String.valueOf(str.charAt(4)));
                    System.out.println("x = " + (a - b));
                    break;
                }
                if (str.charAt(4) == 'x') {
                    int a = Integer.parseInt(String.valueOf(str.charAt(0)));
                    int b = Integer.parseInt(String.valueOf(str.charAt(2)));
                    System.out.println("x = " + (a - b));
                    break;
                }
        }
    }
}
