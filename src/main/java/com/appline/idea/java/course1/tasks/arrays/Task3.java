package com.appline.idea.java.course1.tasks.arrays;

import java.util.Arrays;

/**
 * Задача №3_ Массивы
 * <p>
 * Выполните следующие действия с массивом:
 * <p>
 * Задайте массив из 5 любых целых чисел.
 * Поменяйте местами первый и последний элемент в массиве.
 * Вывести в консоль результат суммы первого и среднего элемента.
 * <p>
 * Примечание : Для получения последнего и среднего элементов в массиве используйте свойство length.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] arrofint = {0, 1, 2, 3, 4};
        int temp = arrofint[0];
        arrofint[0] = arrofint[arrofint.length - 1];
        arrofint[arrofint.length - 1] = temp;
       // System.out.println(Arrays.deepToString(new int[][]{arrofint}));
        System.out.println(Arrays.toString(new int[][]{arrofint}));

        int sumFirstAndAvgEl = arrofint[0] + arrofint[arrofint.length / 2];
        System.out.println("Сумма первого и среднего элемента в массиве = " + sumFirstAndAvgEl);

    }
}
