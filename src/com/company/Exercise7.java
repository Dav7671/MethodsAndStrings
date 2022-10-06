package com.company;

public class Exercise7 {
    public static void main(String[] args) {

        displayFirst50PentagonalNumbers();
    }

    public static void displayFirst50PentagonalNumbers() {
        for (int i = 1; i <= 50; i++) {
            System.out.print((i * (3 * i - 1)) / 2 + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
