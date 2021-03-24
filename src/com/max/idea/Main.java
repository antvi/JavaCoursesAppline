package com.max.idea;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double b = 3.1416;
        byte с = 127;

        int [] arrofint = {0,1,2,3,4};
        int temp =  arrofint[0];
        arrofint[0]=arrofint[arrofint.length-1];
        arrofint[arrofint.length-1]=temp;
        System.out.println(Arrays.deepToString(new int[][]{arrofint}));

        int sumFirstAndAvgEl = arrofint[0] + arrofint[arrofint.length/2];
        System.out.println("Сумма первого и последнего элемента в массиве = " + sumFirstAndAvgEl);

    }
}
