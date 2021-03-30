package com.appline.idea.java.course1.tasks.cycles;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Задача №9_ Циклы
 * <p>
 * Напишите программу:
 * <p>
 * Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
 * <p>
 * Посчитайте среднее арифметическое элементов массива.
 * <p>
 * После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
 */

public class task9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int n = scanner.nextInt();
        double array[] = new double[n];
        System.out.println("Введите числа массива (число с плавающей точкой указывать через ','):");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
        }
        System.out.println(Arrays.deepToString(new double[][]{array}));

        double summas = 0;
        double arisum = 0;

        for (int j = 0; j < n; j++) {
            summas = summas + array[j];
        }

        arisum = summas / 2;

        for (int k = 0; k < n; k++) {
            array[k] = array[k] * arisum;
        }

        System.out.println("Массив умноженный на среднее арифметическое массива " + Arrays.deepToString(new double[][]{array}));

    }
}
