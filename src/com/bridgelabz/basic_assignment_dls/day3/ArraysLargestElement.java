package com.bridgelabz.basic_assignment_dls.day3;

public class ArraysLargestElement {
    public static void main(String[] args) {
        int[] arr = {2,9,12,45,23,6,3,5};
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
        System.out.println("After sorting of arrays element: " + arr[arr.length-1]);
    }
}
