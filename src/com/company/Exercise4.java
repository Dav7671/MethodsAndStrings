package com.company;

public class Exercise4 {
    public static void main(String[] args) {
        String str = "w3rEsOurce";
        System.out.println("Number of Vowels in the string: " + countVowels(str));
    }

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
}
