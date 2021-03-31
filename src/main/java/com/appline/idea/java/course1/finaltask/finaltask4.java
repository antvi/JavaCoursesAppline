package com.appline.idea.java.course1.finaltask;

import java.util.Scanner;

/**
 * Итоговая задача №4
 * <p>
 * Напишите программу-загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”. Ответ: “Заархивированный вирус”.
 * <p>
 * У пользователя есть 3 попытки, чтобы отгадать загадку.
 * <p>
 * Если пользователь ввел верный ответ, вывести: “Правильно!” и завершить работу.
 * <p>
 * Если пользователь ввел неверный ответ на 1 или 2 попытке, вывести “Подумай еще!” и еще раз запросить ответ у пользователя.
 * <p>
 * Если пользователь сделал 3 неправильных попытки, вывести “Обидно, приходи в другой раз” и завершить работу.
 * <p>
 * Также пользователь имеет право на подсказку при первой попытке, при этом 2 и 3 попытки уже недоступны. Если на первой попытке он введет строку “Подсказка”, вывести любую подсказку. Если на 2 и 3, вывести “Подсказка уже недоступна”.
 * <p>
 * Если пользователь, использовавший подсказку, ошибется,
 * вывести “Обидно, приходи в другой раз” и завершить работу.
 */
public class finaltask4 {
    public static void main(String[] args) {


        //var1

     /*   System.out.println("Отгадайте закадку 'Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает':");

        Scanner scanner = new Scanner(System.in);

        String trueAnswer = "заархивированный вирус";
        String help = "подсказка";
        int attempt = 0;
        int maxAttempt = 2;
        boolean trueAmswer = false;

        while (attempt <= maxAttempt) {
            String answer = scanner.nextLine();

//        String answer = "Заархивированный вирус";
//        String answer = "Подсказка";
//        String answer = "Зааированный вирус";


            System.out.println("Вы ввели " + answer);

            if (answer.toLowerCase().intern() == trueAnswer) {
                System.out.println("Правильно!");
                break;
            }
            if ((answer.toLowerCase().intern() == help) && attempt == 0) {
                System.out.println("Введите 'заархивированный вирус'");
                attempt = 2;
                continue;
            } else if ((answer.toLowerCase().intern() == help) && attempt > 0) {
                System.out.println("Подсказка уже недоступна");

            } else {
                if (attempt == maxAttempt) {
                    System.out.println("Обидно, приходи в другой раз");
                    break;
                }
                System.out.println("Подумай еще");
                attempt++;

            }


        }*/

        //var2

        System.out.println("Отгадайте закадку 'Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает':");
        Scanner scanner = new Scanner(System.in);

        String trueAnswer = "заархивированный вирус";
        String help = "подсказка";
        int attempt = 0;
        int maxAttempt = 2;

        while (attempt <= maxAttempt) {
            String answer = scanner.nextLine();

            switch (answer.toLowerCase()) {
                case "подсказка":
                    if (attempt == 0) {
                        System.out.println("Введите 'заархивированный вирус'");
                        attempt = 2;
                        continue;
                    } else {
                        System.out.println("Подсказка уже недоступна");
                        break;
                    }

                case "заархивированный вирус":
                    System.out.println("Правильно!");
                    attempt = 4;
                    break;

                default:
                    if (attempt == maxAttempt) {
                        System.out.println("Обидно, приходи в другой раз");
                        attempt = 4;
                        break;
                    }
                    System.out.println("Подумай еще");
                    attempt++;
                    continue;


            }


        }
    }
}
