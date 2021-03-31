package com.appline.idea.java.course1.finaltask;

import java.util.Scanner;

/**
 * Итоговая задача № 3
 * <p>
 * Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки. Среди данных строк найти строку с максимальным количеством различных символов. Если таких строк будет много, то вывести первую.
 * <p>
 * Пример для теста работы программы:
 * <p>
 * Количество строк: 3
 * Строка 1: привет
 * Строка 2: анализ
 * Строка 3: 111111111111
 * Ответ: привет
 */

public class finaltask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int n = scanner.nextInt();
        //  int n=3;
        String arr[] = new String[n];

        System.out.println("Заполните массив данными:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }

     /*   arr[0]="привет";
        arr[1]="анализ";
        arr[2]="1111111111111";*/


        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();

        int maxDistinctCount = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i].toLowerCase().replace(" ", "").chars().distinct().summaryStatistics().getCount() >=
                    arr[i - 1].toLowerCase().replace(" ", "").chars().distinct().summaryStatistics().getCount()) {
                maxDistinctCount = i;
            }
        }
        System.out.println(arr[maxDistinctCount]);
    }
}
