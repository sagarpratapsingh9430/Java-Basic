package com.bridgelabz.basic_assignment_dls.day2;

public class PalindromeUsingForLoop {
    public static void main(String[] args) {
        //int n = 121;
        int n = 323;
        int rem;
        int reverseNumber = 0;
        int temp = n;

        for (int i=n; i!=0; i=i/10){
            rem = i%10;
            reverseNumber = reverseNumber * 10 + rem;
        }


        if (temp==reverseNumber){
            System.out.println("The number is palindrome number: " + reverseNumber);
        }else {
            System.out.println("Given number is not a palindrome number: " + reverseNumber);
        }

    }
}
