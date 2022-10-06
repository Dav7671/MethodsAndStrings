package com.company;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Side1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Input Side2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Input Side3: ");
        double side3 = scanner.nextDouble();
        double area = getArea(side1, side2, side3);
        if (isValid(side1, side2, side3)) {
            System.out.println("The area of the triangle is " + getArea(side1, side2, side3));
        } else {
            System.out.println("Invalid sides");
        }
    }

    public static boolean isValid(double side1, double side2, double side3) {
        boolean result = false;
        if (side1 > 0 && side2 > 0 && side3 > 0) {
            if (side1 + side2 > side3 &&
                    side2 + side3 > side1 &&
                    side1 + side3 > side2) {
                result = true;
            }
        }
        return result;
    }

    public static double getArea(double a, double b, double c) {

        double halfOfperimeter = (a + b + c) / 2;

        return Math.sqrt(halfOfperimeter * (halfOfperimeter - a) * (halfOfperimeter - b) * (halfOfperimeter - c));
    }
}
