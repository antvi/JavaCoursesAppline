package com.appline.idea.java.course1.tasks.cycles;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Задача №8_ Циклы
 * <p>
 * Напишите программу, где пользователь вводит любое целое положительное число n. А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
 */

public class task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число:");
        int n = scanner.nextInt();
        int array[] = new int[n];


        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.deepToString(new int[][]{array}));

        int sum = 0;
        for (int j = 0; j < array.length / 2; j++) {
            sum = sum + array[2 * j + 1];
        }

        System.out.println("Сумма нечетных чисел массива = " + sum);
    }
}
