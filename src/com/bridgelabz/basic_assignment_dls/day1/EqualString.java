package com.bridgelabz.basic_assignment_dls.day1;

public class EqualString {
    public static void main(String[] args) {
        String name1 = "Sagar";
        String name2 = "Vinit";
        String name3 = "Sagar";
        if (name1.equals(name2)){
            System.out.println("Both name1 and name2 are equal");
        }else if (name1.equals(name3)){
            System.out.println("Name1 and name3 are aqual");
        }else {
            System.out.println("No one strings are equal");
        }
    }
}
