package com.bridgelabz.basic_assignment_dls.day2;

import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a, b and c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int x1 = a+b*c;
        int x2 = c+a/b;
        int x3 = a%b+c;
        int x4 = a*b+c;
        if (x1>x2 && x1>x3 && x1>x4){
            System.out.println("Max x1 =" + x1);
        } else if (x2>x1 && x2>x3 && x2>x4) {
            System.out.println("Max x2 =" + x2);
        } else if (x3>x2 && x3>x1 && x3>x4) {
            System.out.println("Max x3 = " + x3);
        }else {
            System.out.println("Max x4 = " + x4);
        }
    }
}
