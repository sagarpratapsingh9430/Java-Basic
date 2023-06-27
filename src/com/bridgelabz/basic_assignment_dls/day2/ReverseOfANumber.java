package com.bridgelabz.basic_assignment_dls.day2;

public class ReverseOfANumber {
    public static void main(String[] args) {
        int n = 123;
        int reverseNumber = 0;
        int rem;
        while (n>0){
            rem = n%10;
            reverseNumber = reverseNumber*10 + rem;
            n/=10;
        }
        System.out.println("Reverse of a number is: " + reverseNumber);
    }
}
