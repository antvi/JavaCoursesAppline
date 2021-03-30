package com.appline.idea.java.course1.tasks.operators;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Задача №4_Операторы
 * <p>
 * Написать программу, которая будет выполнять следующие действия:
 * <p>
 * Ввести три числа с клавиатуры x, y, z
 * Найти и вывести в консоль среднее арифметическое этих чисел.
 * Разделить среднее арифметическое на 2 и округлить в меньшую сторону
 * Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
 */
public class task4 {
    public static void main(String[] args) {

        int n = 3;
        Scanner scanner = new Scanner(System.in);
        int masnum[] = new int[n];
        int i;

        System.out.println("Введите три числа:");
        for (i = 0; i < n; i++) {
            masnum[i] = scanner.nextInt();
            System.out.println("Вы ввели: " + masnum[i]);
        }
        System.out.println(Arrays.deepToString(new int[][]{masnum}));

        double sum = 0;
        for (int num : masnum) {
            sum = (sum + num);
        }
        double AVG = sum / n;
        System.out.println("Среднее арифметическое введенного массива = " + AVG);

        double AVGdevTwoAndRound = Math.floor(AVG / 2);
        System.out.println("AVGdevTwoAndRound = " + AVGdevTwoAndRound);
        if (AVGdevTwoAndRound > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
