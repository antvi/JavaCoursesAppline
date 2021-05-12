package com.appline.idea.java.course2;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
//task2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные для калькуляции \n " +
                "операторы: +-* \n" +
                "значения с плавающей точкой через точку \n" +
                "после чего нажмите ентер");
        String calc = scanner.nextLine();
//        String calc = "34.45 : 23.54 ";
        calc = calc.replaceAll("\\s", "");

        String[] calcArr = calc.split("[\\-*+:]+");

        double x = Double.parseDouble(calcArr[0]);
        double y = Double.parseDouble(calcArr[1]);

        List actions = new ArrayList();
        actions.add("+");
        actions.add("-");
        actions.add("*");
        actions.add(":");

        int actionsIndex = 0;

       /* for (int i = 0; i < actions.size(); i++) {
            if (calc.contains((CharSequence) actions.get(i))) {
              int actionsIndex = i;
            }
        }*/


        switch (actionsIndex) {
            case 0:
                getSum(x, y);
                break;
            case 1:
                getMinus(x, y);
                break;
            case 2:
                getMultiplication(x, y);
                break;
            case 3:
                getDivision(x, y);
                break;
        }
    }

    public static PrintStream getSum(double a, double b) {
        double result = a + b;
        return System.out.printf("%.4f", result);
    }

    public static PrintStream getMinus(double a, double b) {
        double result = a - b;
        return System.out.printf("%.4f", result);
    }

    public static PrintStream getMultiplication(double a, double b) {
        double result = a * b;
        return System.out.printf("%.4f", result);
    }

    public static PrintStream getDivision(double a, double b) {
        double result = a / b;
        return System.out.printf("%.4f", result);
    }
}
