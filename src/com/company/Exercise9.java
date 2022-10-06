package com.company;

public class Exercise9 {
    public static void main(String[] args) {

        printChars('(', 'z');
    }

    public static void printChars(char char1, char char2) {
        for (int i = 1; char1 <= char2; char1++, i++) {
            System.out.print(char1 + " ");
            if (i % 20 == 0) {
                System.out.println(" ");
            }
        }
    }
}
