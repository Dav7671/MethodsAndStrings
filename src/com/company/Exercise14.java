package com.company;

public class Exercise14 {
    public static void main(String[] args) {

        printAllTwinPrimeNumbers();
    }

    public static boolean isPrime(int num) {

        if (num < 2) return false;

        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) return false;
        }
        return true;
    }

    public static void printAllTwinPrimeNumbers() {
        for (int i = 3; i < 100; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.print("(" + i + "," + (i + 2) + ") \n");
            }
        }
    }
}
