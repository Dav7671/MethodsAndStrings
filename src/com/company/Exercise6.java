package com.company;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Input an integer ");
        num = scanner.nextInt();
        System.out.println("The sum is : " + sumOfDigits(num));

    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}
