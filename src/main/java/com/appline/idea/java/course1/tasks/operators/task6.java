package com.appline.idea.java.course1.tasks.operators;

import java.util.Scanner;

/**
 * Задача №6_ Операторы
 * <p>
 * Напишите программу конвертер физических величин:
 * <p>
 * 1. Пользователю предлагается на выбор ввести массу или расстояние. Пример: > Выберите что
 * переводить: 1 - масса, 2 - расстояние > 2
 * <p>
 * 2. Пользователю предлагается выбрать единицу измерения. Пример: > Выберите единицу измерения: 1 -
 * метр, 2 - миля, 3 - ярд, 4 - фут > 1
 * <p>
 * 3. Пользователю предлагается ввести количество выбранных единиц: > Введите число > 10 >
 * Результат: > Метры: 10 > Мили: 0.006 > Ярды: 10.94 > Футы: 32.81
 */

public class task6 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние:");
    int what = scanner.nextInt();

    switch (what) {
      case 1:

        System.out.println(
            "Выберите единицу измерения масса: 1 - грамм, 2 - килограм, 3 - центнер, 4 - тонна:");
        int meas1 = scanner.nextInt();

        System.out.println("Введите число");
        int num = scanner.nextInt();

        switch (meas1) {
          case 1:
//            System.out.println("грамм:" + num);
//            double gramtoKg = num * 0.001;
//            System.out.println("килограм:" + gramtoKg);
//            double gramtoCent = num * 0.00001;
//            System.out.println("центнер:" + gramtoCent);
//            double gramtoTon = num * 0.000001;
//            System.out.println("тонна:" + gramtoTon);

            double result1 = num * 0.001;
            double result2 = num * 0.00001;
            double result3 = num * 0.000001;

            break;

          case 2:
//            System.out.println("килограм:" + num);
//            double kgtogramm = num * 1000;
//            System.out.println("грамм:" + kgtogramm);
//            double kgtoCent = num * 0.01;
//            System.out.println("центнер:" + kgtoCent);
//            double kgtoTon = num * 0.001;
//            System.out.println("тонна:" + kgtoTon);

            double result1 = num * 1000;
            double result2 = num * 0.01;
            double result3 = num * 0.001;

            break;
          case 3:

//            System.out.println("центнер:" + num);
//            double centtogramm = num * 100000;
//            System.out.println("грамм:" + centtogramm);
//            double centtoKg = num * 100;
//            System.out.println("килограм:" + centtoKg);
//            double centtoTon = num * 0.1;
//            System.out.println("тонна:" + centtoTon);

            double result1 = num * 100000;
            double result2 = num * 100;
            double result3 = num * 0.1;

            break;
          case 4:
//            System.out.println("тонна:" + num);
//            double tontogramm = num * 1000000;
//            System.out.println("грамм:" + tontogramm);
//            double tontoKg = num * 1000;
//            System.out.println("килограм:" + tontoKg);
//            double tontocent = num * 10;
//            System.out.println("центнер:" + tontocent);

              double result1 = num * 1000000;
              double result2 = num * 1000;
              double result3 = num * 10;
            break;

        }
        break;

      case 2:

        System.out.println(
            "Выберите единицу измерения расстояние: 1 - метр, 2 - миля, 3 - ярд, 4 - фут:");
        int meas2 = scanner.nextInt();
        System.out.println("Введите число");
        int num2 = scanner.nextInt();

        switch (meas2) {
          case 1:
            System.out.println("Метры:" + num2);
            double metrtoMile = num2 * 0.0006;
            System.out.println("Мили:" + metrtoMile);
            double metrtoYard = num2 * 1.093613;
            System.out.println("Ярды:" + metrtoYard);
            double metrtoFoot = num2 * 3.28084;
            System.out.println("Футы:" + metrtoFoot);
            break;
          case 2:
            System.out.println("Мили:" + num);
            double miletoMetr = num * 1609.3;
            System.out.println("Метры:" + miletoMetr);
            double miletoYard = num * 1760;
            System.out.println("Ярды:" + miletoYard);
            double miletoFoot = num * 5280;
            System.out.println("Футы:" + miletoFoot);
            break;
          case 3:
            System.out.println("Ярды:" + num);
            double yardtoMetr = num * 0.9144;
            System.out.println("Метры:" + yardtoMetr);
            double yardtoMile = num * 0.00057;
            System.out.println("Мили:" + yardtoMile);
            double yardtoFoot = num * 3;
            System.out.println("Футы:" + yardtoFoot);
            break;
          case 4:
            System.out.println("Футы:" + num);
            double foottoMetr = num * 0.3048;
            System.out.println("Метры:" + foottoMetr);
            double foottoMile = num * 0.000189;
            System.out.println("Мили:" + foottoMile);
            double foottoYard = num * 0.333;
            System.out.println("Ярды:" + foottoYard);
            break;
        }

    }


  }
}
