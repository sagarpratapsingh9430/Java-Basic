package com.bridgelabz.basic_assignment_dls.day1;

import java.util.Scanner;

public class NameUsingCommandLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println(name);
    }
}
