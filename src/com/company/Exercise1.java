package com.company;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        double a = scanner.nextDouble();
        System.out.println("Input the second number: ");
        double b = scanner.nextDouble();
        System.out.println("Input the third number: ");
        double c = scanner.nextDouble();

        System.out.println("The smallest value is " + findSmallest(a, b, c));
    }
    public static double findSmallest(double a, double b, double c) {
        double min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}