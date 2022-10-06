package com.company;

public class Exercise16 {
    public static void main(String[] args) {

        System.out.println("Check whether the three said numbers are consecutive or not! " + isConsecutive(15, 16, 17));

    }

    public static boolean isConsecutive(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int middle = a + b + c - max - min;
        return (max - middle) == 1 && (middle - min == 1);
    }
}
