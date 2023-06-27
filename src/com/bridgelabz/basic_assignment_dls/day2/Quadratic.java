package com.bridgelabz.basic_assignment_dls.day2;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value of a, b and c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double delta = b*b-4*a*c;

        double x1 = (-b+Math.sqrt(delta))/(2*a);
        double x2 = (-b-Math.sqrt(delta))/(2*a);

        System.out.println("Root of a quadratic equation are: " + x1 + " " + x2);
    }
}
