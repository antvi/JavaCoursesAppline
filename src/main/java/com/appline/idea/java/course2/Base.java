package com.appline.idea.java.course2;

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        String text = scanner.next();

        System.out.println(i);
        System.out.println(text);

        System.err.println("This is error stream");
        scanner.close();
    }
}
