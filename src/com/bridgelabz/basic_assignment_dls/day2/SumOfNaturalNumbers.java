package com.bridgelabz.basic_assignment_dls.day2;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        int sum = 0;
        for (int i=0; i<=x; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
