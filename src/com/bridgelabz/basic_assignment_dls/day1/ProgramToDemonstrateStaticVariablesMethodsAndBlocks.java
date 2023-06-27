package com.bridgelabz.basic_assignment_dls.day1;

public class ProgramToDemonstrateStaticVariablesMethodsAndBlocks {
    static int x = 10;
    static void calculate(){
        int y = 20;
        int sum = x+y;
        System.out.println(sum);
    }
    static int product(int num1, int num2){
        int prod = num1*num2;
        return prod;
    }

    public static void main(String[] args) {
        calculate();
        System.out.println(product(25,10));
    }
}
