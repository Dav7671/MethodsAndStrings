package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        double a = scanner.nextDouble();
        System.out.println("Input the second number: ");
        double b = scanner.nextDouble();
        System.out.println("Input the third number: ");
        double c = scanner.nextDouble();

        // Exercise 1

        System.out.println("The smallest value is " + findSmallest(a, b, c));

        // Exercise 2

        System.out.println("The average is " + findAverage(a, b, c));

        // Exercise 3

        String str = "String";
        printMiddleCharacter(str);

        // Exercise 4

        String word = "w3rEsOurce";
        System.out.println("Number of Vowels in the string: " + countVowels(str));

        // Exercise 5

        String input;
        System.out.print("Input the String ");
        input = scanner.nextLine();
        System.out.println("Number of words in the string : " + countWords(input));

        // Exercise 6
        int num;
        System.out.print("Input an integer ");
        num = scanner.nextInt();
        System.out.println("The sum is : " + sumOfDigits(num));

        // Exercise 7

        // A polygonal number of the form n(3n-1)/2

        displayFirst50PentagonalNumbers();

        // Exercise 8

        System.out.print("Input the investment amount: ");
        double investment = scanner.nextDouble();
        System.out.print("Input the rate of interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Input number of years: ");
        int years = scanner.nextInt();

        System.out.println("Years \t Future Value \n");
        for (int year = 1; year <= years; year++) {
            System.out.println(year + "\t" + futureInvestmentValue(investment, rate, year));
        }

        // Exercise 9

        printChars('(', 'z');

        // Exercise 10

        System.out.print("Input a year : ");
        int year = scanner.nextInt();
        System.out.println(isLeapYear(year));

        // Exercise 11

        System.out.print("1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits\n" +
                "Input a password (You are agreeing to the above Terms and Conditions.): ");

        String password = scanner.nextLine();
        boolean foo = isValidPassword(password);
        if (foo) {
            System.out.println("Password is valid: " + password);
        } else {
            System.out.println("NOT a valid password: " + password);
        }


        // Exercise 12

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


        // Exercise 13

        System.out.print("Input the number of sides: ");
        int numberOfSides = scanner.nextInt();
        System.out.print("Input the side: ");
        double side = scanner.nextDouble();
        if (isValid(numberOfSides, side)) {
            System.out.println("The area of the pentagon is " + getArea(numberOfSides, side));
        } else {
            System.out.println("Invalid input");
        }

        // Exercise 14

        printAllTwinPrimeNumbers();

        // Exercise 15

        int number;
        do {
            System.out.print("Input a number: ");
            number = scanner.nextInt();
        } while (number < 0);
        System.out.println("Count of Value 2: " + counterValueTwo(number));

        // Exercise 16

        System.out.println("Check whether the three said numbers are consecutive or not! " + isConsecutive(15, 16, 17));

        // Exercise 17

        factorsOf3(99);

        // Exercise 18

        System.out.print("Input an integer(positive/negative):");
        int numInt;
        numInt = scanner.nextInt();
        System.out.println("The first digit : " + firstDigit(numInt));

    }


    // Exercise 1

    public static double findSmallest(double a, double b, double c) {
        double min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    // Exercise 2

    public static double findAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    // Exercise 3

    public static void printMiddleCharacter(String str) {
        int middle = str.length() / 2;
        System.out.println("Middle Character in the String : " + str.charAt(middle));
    }

    // Exercise 4

    public static int countVowels(String str) {
        String str2 = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == 'a' || str2.charAt(i) == 'o' || str2.charAt(i) == 'u' || str2.charAt(i) == 'i' || str2.charAt(i) == 'e') {
                count++;
            }
        }
        return count;
    }

    // Exercise 5

    public static int countWords(String str) {
        String[] words = str.split(" ");
        return words.length;
    }

    // Exercise 6

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    // Exercise 7

    public static void displayFirst50PentagonalNumbers() {
        for (int i = 1; i <= 50; i++) {
            System.out.print((i * (3 * i - 1)) / 2 + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    // Exercise 8

    public static double futureInvestmentValue(double investment, double rate, int years) {
        return investment * Math.pow((1 + rate / 100 / 12), years * 12);
    }


    // Exercise 9

    public static void printChars(char char1, char char2) {
        for (int i = 1; char1 <= char2; char1++, i++) {
            System.out.print(char1 + " ");
            if (i % 20 == 0) {
                System.out.println(" ");
            }
        }
    }

    // Exercise 10

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

    // Exercise 11

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        int letterCount = 0;
        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetter(password.charAt(i))) {
                letterCount++;
            }
            if (Character.isDigit(password.charAt(i))) {
                digitCount++;
            }
        }

        return letterCount + digitCount == password.length() && digitCount >= 2;
    }

    // Exercise 12

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


    // Exercise 13

    public static boolean isValid(int n, double side) {
        return (n > 4) && (side > 0);
    }

    public static double getArea(int numberOfSides, double side) {
        return (numberOfSides * side * side) / (4 * Math.tan(Math.PI / numberOfSides));
    }

    // Exercise 14

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

    // Exercise 15

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

    // Exercise 16

    public static boolean isConsecutive(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int middle = a + b + c - max - min;
        return (max - middle) == 1 && (middle - min == 1);
    }

    // Exercise 17

    public static void factorsOf3(int num) {
        System.out.print(num + " = ");
        int tmp = num;
        while (tmp % 3 == 0) {
            System.out.print(" 3 * ");
            tmp /= 3;
        }
        System.out.print(tmp);
    }

    // Exercise 18

    public static int firstDigit(int num) {
        num = Math.abs(num);
        String number = Integer.toString(num);
        return Integer.parseInt(String.valueOf(number.charAt(0)));
    }

}
