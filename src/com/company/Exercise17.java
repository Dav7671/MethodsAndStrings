package com.company;

public class Exercise17 {
    public static void main(String[] args) {

        factorsOf3(81);

    }

    public static void factorsOf3(int num) {
        System.out.print(num + " = ");
        int tmp = num;
        while (tmp % 3 == 0) {
            System.out.print(" 3 * ");
            tmp /= 3;
        }
        System.out.print(tmp);
    }
}
