package com.company;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        double a = scanner.nextDouble();
        System.out.println("Input the second number: ");
        double b = scanner.nextDouble();
        System.out.println("Input the third number: ");
        double c = scanner.nextDouble();

        System.out.println("The average is " + findAverage(a, b, c));
    }

    public static double findAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
