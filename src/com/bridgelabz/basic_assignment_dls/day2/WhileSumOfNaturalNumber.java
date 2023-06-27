package com.bridgelabz.basic_assignment_dls.day2;

import java.util.Scanner;

public class WhileSumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        int sum = 0;
        int n=1;
        while (n<=x){
            sum = sum + n;
            n++;
        }
        System.out.println("Sum of natural number is: " + sum );
    }
}
