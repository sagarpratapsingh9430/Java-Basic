package com.bridgelabz.basic_assignment_dls.day1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();

        if (year>=1582){
            if ((year%4==0 && year%100!=0) || (year%4==0 && year%400==0)) {
                System.out.println("This is leap year: " + year);
            }else {
                System.out.println("This is not a leap year: " + year);
            }
        }
    }
}
