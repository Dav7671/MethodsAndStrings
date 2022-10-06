package com.company;

public class Exercise3 {
    public static void main(String[] args) {

        String str = "String";
        printMiddleCharacter(str);
    }

    public static void printMiddleCharacter(String str) {
        int middle = str.length() / 2;
        System.out.println("Middle Character in the String : " + str.charAt(middle));
    }
}
