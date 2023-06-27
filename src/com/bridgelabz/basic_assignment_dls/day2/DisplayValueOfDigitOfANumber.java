package com.bridgelabz.basic_assignment_dls.day2;

import java.util.Scanner;

public class DisplayValueOfDigitOfANumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a four digit number: ");
        int n = sc.nextInt();
        int thousands = (n/1000)%10;

        if (thousands<=9){
            System.out.println("Thousand place digit: " + thousands);
        }

        int hundreds = (n/100)%10;
        if (hundreds<=9){
            System.out.println("Hundred place digit: " + hundreds);
        }

        int tens = (n/10)%10;
        if (tens<=9){
            System.out.println("Tens place digit: " + tens);
        }

        int ones = (n/1)%10;
        if (ones<=9){
            System.out.println("Ones place digit: " + ones);
        }
    }
}
