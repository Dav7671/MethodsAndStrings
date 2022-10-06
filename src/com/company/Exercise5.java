package com.company;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.print("Input the String ");
        input = scanner.nextLine();
        System.out.println("Number of words in the string : " + countWords(input));

    }

    public static int countWords(String str) {
        String[] words = str.split(" ");
        return words.length;
    }
}
