package com.max.idea;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //task 1
        System.out.println("Hello world!");
        //task 2
        double b = 3.1416;
        byte с = 127;

        //task 3
        int[] arrofint = {0, 1, 2, 3, 4};
        int temp = arrofint[0];
        arrofint[0] = arrofint[arrofint.length - 1];
        arrofint[arrofint.length - 1] = temp;
        System.out.println(Arrays.deepToString(new int[][]{arrofint}));

        int sumFirstAndAvgEl = arrofint[0] + arrofint[arrofint.length / 2];
        System.out.println("Сумма первого и последнего элемента в массиве = " + sumFirstAndAvgEl);

        //task4
        int n = 3;
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
        }
    }
}
