package com.max.idea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //task 1
        /*     System.out.println("Hello world!");*/
        //task 2
     /*   double b = 3.1416;
        byte с = 127;*/

        //task 3
    /*    int[] arrofint = {0, 1, 2, 3, 4};
        int temp = arrofint[0];
        arrofint[0] = arrofint[arrofint.length - 1];
        arrofint[arrofint.length - 1] = temp;
        System.out.println(Arrays.deepToString(new int[][]{arrofint}));

        int sumFirstAndAvgEl = arrofint[0] + arrofint[arrofint.length / 2];
        System.out.println("Сумма первого и последнего элемента в массиве = " + sumFirstAndAvgEl);
*/
        //task4
       /* int n = 3;
        Scanner scanner = new Scanner(System.in);
        int masnum[] = new int[n];
        int i;

        System.out.println("Введите три числа:");
        for (i = 0; i < n; i++) {
            masnum[i] = scanner.nextInt();
            System.out.println("Вы ввели: " + masnum[i]);
        }
        System.out.println(Arrays.deepToString(new int[][]{masnum}));

        double sum =0;
         for(int num : masnum){
             sum = (sum + num);
         }
        double AVG = sum/n;
        System.out.println("Среднее арифметическое введенного массива = " + AVG);

        double AVGdevTwoAndRound = Math.floor(AVG/2);
        System.out.println("AVGdevTwoAndRound = " + AVGdevTwoAndRound);
        if (AVGdevTwoAndRound > 3){
            System.out.println( "Программа выполнена корректно");
        }*/

        //task5
    /*    Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int num2 = scanner.nextInt();
        System.out.println("Введите арифметическую операцию *,/,+,-:");
        char action = scanner.next().charAt(0);

        double result;

        switch (action) {
                case '/':
                    result = num1 / num2;
                    System.out.println("result = "+ result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("result = "+ result);
                    break;
                case '-':
                    result =  num1 - num2;
                    System.out.println("result = "+ result);
                    break;
                case '+':
                    result = num1 + num2;
                    System.out.println("result = "+ result);
                    break;
            }
            */
        //task6

     /*   Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние:");
        int what = scanner.nextInt();
        System.out.println("Введите число");
        int num = scanner.nextInt();

        switch (what){
            case 1:

                System.out.println("Выберите единицу измерения масса: 1 - грамм, 2 - килограм, 3 - центнер, 4 - тонна:");
                int meas1 = scanner.nextInt();

                switch (meas1){
                    case 1:
                        System.out.println("грамм:" + num);
                        double gramtoKg = num *  0.001;
                        System.out.println("килограм:" + gramtoKg);
                        double gramtoCent = num *  0.00001;
                        System.out.println("центнер:" + gramtoCent);
                        double gramtoTon = num *  0.000001;
                        System.out.println("тонна:" + gramtoTon);
                        break;
                    case 2:
                        System.out.println("килограм:" + num);
                        double kgtogramm = num *  1000;
                        System.out.println("грамм:" + kgtogramm);
                        double kgtoCent = num *  0.01;
                        System.out.println("центнер:" + kgtoCent);
                        double kgtoTon = num *  0.001;
                        System.out.println("тонна:" + kgtoTon);
                        break;
                    case 3:
                        System.out.println("центнер:" + num);
                        double centtogramm = num *  100000;
                        System.out.println("грамм:" + centtogramm);
                        double centtoKg = num *  100;
                        System.out.println("килограм:" + centtoKg);
                        double centtoTon = num *  0.1;
                        System.out.println("тонна:" + centtoTon);
                        break;
                    case 4:
                        System.out.println("тонна:" + num);
                        double tontogramm = num *  1000000;
                        System.out.println("грамм:" + tontogramm);
                        double tontoKg = num *  1000;
                        System.out.println("килограм:" + tontoKg);
                        double tontocent = num *  10;
                        System.out.println("центнер:" + tontocent);
                        break;

                }
                break;
            case 2:

                System.out.println("Выберите единицу измерения расстояние: 1 - метр, 2 - миля, 3 - ярд, 4 - фут:");
                int meas2= scanner.nextInt();


                switch (meas2){
                    case 1:
                        System.out.println("Метры:" + num);
                        double metrtoMile = num *  0.0006;
                        System.out.println("Мили:" + metrtoMile);
                        double metrtoYard = num *  1.093613;
                        System.out.println("Ярды:" + metrtoYard);
                        double metrtoFoot = num *  3.28084;
                        System.out.println("Футы:" + metrtoFoot);
                        break;
                    case 2:
                        System.out.println("Мили:" + num);
                        double miletoMetr = num *  1609.3;
                        System.out.println("Метры:" + miletoMetr);
                        double miletoYard = num * 1760;
                        System.out.println("Ярды:" + miletoYard);
                        double miletoFoot = num *  5280;
                        System.out.println("Футы:" + miletoFoot);
                        break;
                    case 3:
                        System.out.println("Ярды:" + num);
                        double yardtoMetr = num *  0.9144;
                        System.out.println("Метры:" + yardtoMetr);
                        double yardtoMile = num * 0.00057;
                        System.out.println("Мили:" + yardtoMile);
                        double yardtoFoot = num *  3;
                        System.out.println("Футы:" + yardtoFoot);
                        break;
                    case 4:
                        System.out.println("Футы:" + num);
                        double foottoMetr = num *  0.3048;
                        System.out.println("Метры:" + foottoMetr);
                        double foottoMile = num * 0.000189;
                        System.out.println("Мили:" + foottoMile);
                        double foottoYard = num * 0.333;
                        System.out.println("Ярды:" + foottoYard);
                        break;
                }

        }*/

        //task7
   /*     Scanner scanner = new Scanner(System.in);
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

        for ( int j=0; j<array.length; j++) {
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
            }*/

        //task8
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число:");
        int n = scanner.nextInt();
        int array[] = new int[n];


        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.deepToString(new int[][]{array}));

        int sum = 0;
        for (int j = 0; j < array.length/2; j++) {
            sum = sum + array[2 * j + 1];
        }

        System.out.println("Сумма нечетных чисел массива = " + sum);*/

        //task9
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int n = scanner.nextInt();
        double array[] = new double[n];
        System.out.println("Введите числа массива (число с плавающей точкой указывать через ','):");
        for (int i=0; i<n; i++){
            array[i] = scanner.nextDouble();
        }
        System.out.println(Arrays.deepToString(new double[][]{array}));

        double summas = 0;
        double arisum=0;

        for(int j =0; j<n; j++){
            summas =summas + array[j];
        }

        arisum = summas/2;

        for (int k=0;k<n;k++){
            array[k] = array[k]*arisum;
        }

        System.out.println("Массив умноженный на среднее арифметическое массива " + Arrays.deepToString(new double[][]{array}));
*/

        //task 10
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
            matrix[0][i] = matrix[0][i] * 3;
            System.out.print(matrix[0][i] + " ");
        }

    }
}

