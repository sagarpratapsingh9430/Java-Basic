package com.bridgelabz.basic_assignment_dls.day2;

import java.util.Scanner;

public class CheckVowelConsonentUsingSwitch {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a character to check: ");
        char ch = sc.next().charAt(0);

        switch (ch){
            case 'a':
                System.out.println("It is vowel: " + ch);
                break;
            case 'e':
                System.out.println("It is vowel: " + ch);
                break;
            case 'i':
                System.out.println("It is vowel: " + ch);
                break;
            case 'o':
                System.out.println("It is vowel: " + ch);
                break;
            case 'u':
                System.out.println("It is vowel: " + ch);
                break;
            default:
                System.out.println("It is consonant: " + ch);

        }
    }
}
