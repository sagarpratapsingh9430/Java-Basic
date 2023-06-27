package com.bridgelabz.basic_assignment_dls.day3;

public class ArraysElementAtEvenIndex {
    public static void main(String[] args) {
        int[] arr = {2,7,12,34,55,9,8};
        for (int i=0; i< arr.length; i=i+2){
            System.out.println(arr[i]);
        }
    }
}
