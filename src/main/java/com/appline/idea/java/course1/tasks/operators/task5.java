package com.appline.idea.java.course1.tasks.operators;

import java.util.Scanner;

/**
 * Задача №5_ Операторы
 * <p>
 * Напишите простой калькулятор:
 * <p>
 * Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’.
 * В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
 */
public class task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int num2 = scanner.nextInt();
        System.out.println("Введите арифметическую операцию *,/,+,-:");
        char action = scanner.next().charAt(0);

        double result = 0;

        switch (action) {
            default:
                System.out.println("Недопустимая арифметическая операция");
                break;
            case '/':
                result = num1 / num2;
               // System.out.println("result = " + result);
                break;
            case '*':
                result = num1 * num2;
              //  System.out.println("result = " + result);
                break;
            case '-':
                result = num1 - num2;
              //  System.out.println("result = " + result);
                break;
            case '+':
                result = num1 + num2;
               // System.out.println("result = " + result);
                break;
        }
        System.out.println("result = " + result);

    }
}
