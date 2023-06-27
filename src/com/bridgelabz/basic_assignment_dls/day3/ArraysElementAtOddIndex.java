package com.bridgelabz.basic_assignment_dls.day3;

public class ArraysElementAtOddIndex {
    public static void main(String[] args) {
        int[] arr = {23,67,512,2,6,9,6};
        for (int i=1; i< arr.length; i=i+2){
            System.out.println(arr[i]);
        }
    }
}
