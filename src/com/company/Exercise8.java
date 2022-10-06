package com.company;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
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
    }

    public static double futureInvestmentValue(double investment, double rate, int years) {
        return investment * Math.pow((1 + rate / 100 / 12), years * 12);
    }
}
