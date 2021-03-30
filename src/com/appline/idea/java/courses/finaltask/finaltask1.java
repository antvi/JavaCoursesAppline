package com.appline.idea.java.courses.finaltask;

import java.util.Scanner;

/**
 * Итоговая задача №1
 * <p>
 * Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу. Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой. Пример для теста работы программы:
 * <p>
 * Курс доллара: 67,55
 * Количество рублей: 1000
 * Итого: 14,80 долларов
 */

public class finaltask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите курс доллара: (через запятую)");
        double dollarRate = scanner.nextDouble();
        System.out.println("Введите количество рублей:");
        int rub = scanner.nextInt();

        double conv = rub / dollarRate;
        System.out.format("Итого:" + "%.2f", conv);

    }
}
