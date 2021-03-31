package com.appline.idea.java.course1.tasks.cycles;

import java.util.Scanner;

/**
 * Задача №10_Циклы
 * <p>
 * Напишите программу, где пользователь вводит данные с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
 */

public class task10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерость матрицы n ,k:");
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println("Введите элементы матрицы:");

        int matrix[][] = new int[n][k];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Введенная матрица:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("Вывод первой строки матрицы на экран, где каждый элемент умножается на 3:");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < 1; j++) {
                matrix[j][i] = matrix[j][i] * 3;
                System.out.print(matrix[j][i] + " ");

            }
        }
    }
}
