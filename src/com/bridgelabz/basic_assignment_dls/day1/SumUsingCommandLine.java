package com.bridgelabz.basic_assignment_dls.day1;

import java.util.Scanner;

public class SumUsingCommandLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = sc.nextInt();
        System.out.println("Enter the second number: ");
        int y = sc.nextInt();
        int sum = x+y;
        System.out.println("Sum of two numbers are: "+ sum);
    }
}
