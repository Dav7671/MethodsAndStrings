package com.company;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
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
    }

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
}
