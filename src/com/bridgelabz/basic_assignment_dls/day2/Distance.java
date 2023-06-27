package com.bridgelabz.basic_assignment_dls.day2;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x and y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int x1 = 0;
        int y1 = 0;
        double distance = Math.sqrt(Math.pow(x1-x,2) + Math.pow(y1-y,2));
        double distance2 = Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));

        System.out.println(distance);
        System.out.println(" Distance = " + distance2);
    }
}
