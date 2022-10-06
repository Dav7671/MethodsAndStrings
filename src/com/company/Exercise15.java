package com.company;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Input a number: ");
            number = scanner.nextInt();
        } while (number < 0);
        System.out.println("Count of Value 2: " + counterValueTwo(number));
    }

    public static int counterValueTwo(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 10 == 2) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}
