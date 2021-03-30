package com.appline.idea.java.course1.tasks.workwithdata;

/**
 * Задача №12_Работа с данными
 * <p>
 * Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:
 * <p>
 * Проверить, содержит ли строка подстроку “Java” (используйте contains()).
 * <p>
 * Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
 * <p>
 * Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
 * <p>
 * Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
 * <p>
 * Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран  (используйте substring()).
 */

public class task12 {
    public static void main(String[] args) {


        String java = "I like Java!!!";

        boolean result1 = java.contains("Java");
        System.out.println("Java is " + result1);

        boolean result2 = java.startsWith("I like");
        System.out.println("I like " + result2);

        boolean result3 = java.endsWith("!!!");
        System.out.println("!!! is " + result3);

        if (result1 == result2 == result3) {
            String javaUpStr = java.toUpperCase();
            System.out.println(javaUpStr);
        }

        String totalRes = java.replaceAll("a", "o");
        System.out.println(totalRes);

        String totalRes2 = java.substring(7, 11).replaceAll("a", "o");
        System.out.println(totalRes2);
    }
}
