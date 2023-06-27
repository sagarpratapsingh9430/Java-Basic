package com.bridgelabz.basic_assignment_dls.day2;

public class ReverseOfANumberUsingFor {
    public static void main(String[] args) {
        int n=123;

        int rem;
        int reverseNumber = 0;
        for (int i=n; i!=0;i=i/10){
            rem = i%10;
            reverseNumber = reverseNumber * 10 + rem;

        }
        System.out.println("Reverse of a number: " + reverseNumber);
    }
}
