package com.company;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a year : ");
        int year = scanner.nextInt();
        System.out.println(isLeapYear(year));
    }

    /* If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
     If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
     If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
     The year is a leap year (it has 366 days).
     The year is not a leap year (it has 365 days).
 */
    public static boolean isLeapYear(int year) {
        boolean a = (year % 4) == 0;
        boolean b = (year % 100) != 0;
        boolean c = ((year % 100 == 0) && (year % 400 == 0));

        return a && (b || c);
    }
}
