package com.appline.idea.java.courses.tasks.workwithdata;

/**
 * Задача №13_ Работа с данными
 * <p>
 * Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами. Например: “I love java 8 Я люблю java 14 core1”. Выполните следующие действия:
 * <p>
 * Выведите слова, состоящие только из латиницы.
 * <p>
 * Выведите количество этих слов.
 */

public class task14 {
    public static void main(String[] args) {


        int array[] = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 30) - 15);
            System.out.print(array[i] + " ");
        }


        int max = 0;
        int min = 0;

        System.out.println();

        for (int j = 0; j < array.length; j++) {
            if (min > array[j]) {
                min = array[j];
            }
            if (max < array[j]) {
                max = array[j];
            }
        }
        System.out.println("max = " + max + "  " + "min = " + min);


        if (Math.abs(min) <= Math.abs(max)) {
            int abs = Math.abs(max);
            System.out.println("Больший по модулю из max и min = " + max + " Модуль = " + abs);

        } else {
            int abs = Math.abs(min);
            System.out.println("Больший по модулю из max и min = " + min + " Модуль = " + abs);
        }
    }
}
