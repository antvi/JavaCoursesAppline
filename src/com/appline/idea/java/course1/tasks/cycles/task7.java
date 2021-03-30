package com.appline.idea.java.course1.tasks.cycles;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Задача №7_ Циклы
 * <p>
 * Напишите программу:
 * <p>
 * Пользователь вводит размер массива и данные с клавиатуры в массив
 * <p>
 * Сравнить элементы массива с заранее заданными константами x, y, z.
 * <p>
 * Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
 */
public class task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива;");
        int n = scanner.nextInt();

        int array[] = new int[n];
        int i;
        int x = 2;
        int y = 5;
        int z = 9;

        System.out.println("Введите числа в массиве:");
        for (i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            System.out.println("Вы ввели: " + array[i]);
        }
        System.out.println(Arrays.deepToString(new int[][]{array}));

        for (int j = 0; j < array.length; j++) {
            if ((x == array[j])) {
                System.out.println("Данное значение имеется в константах " + x);
                break;
            }
            if ((y == array[j])) {
                System.out.println("Данное значение имеется в константах " + y);
                break;
            }
            if ((z == array[j])) {
                System.out.println("Данное значение имеется в константах " + z);
                break;
            }
        }
    }
}
