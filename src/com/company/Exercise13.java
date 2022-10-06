package com.company;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of sides: ");
        int numberOfSides = scanner.nextInt();
        System.out.print("Input the side: ");
        double side = scanner.nextDouble();
        if (isValid(numberOfSides, side)) {
            System.out.println("The area of the pentagon is " + getArea(numberOfSides, side));
        } else {
            System.out.println("Invalid input");
        }

    }

    public static boolean isValid(int n, double side) {
        return (n > 4) && (side > 0);
    }

    public static double getArea(int numberOfSides, double side) {
        return (numberOfSides * side * side) / (4 * Math.tan(Math.PI / numberOfSides));
    }
}
