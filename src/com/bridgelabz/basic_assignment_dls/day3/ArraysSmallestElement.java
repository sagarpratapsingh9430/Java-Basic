package com.bridgelabz.basic_assignment_dls.day3;

public class ArraysSmallestElement {
    public static void main(String[] args) {
        int[] arr = {2,13,45,28,56,7,9,5};
        int temp = 0;
        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Smallest element of an arrays: " + arr[0]);
    }
}
