package com.bridgelabz.basic_assignment_dls.day3;

public class DuplicateElementOfAnArrays {
    public static void main(String[] args) {
        int[] arr = {23,4,1,4,1,65,78,65};

        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i] == arr[j]){
                    System.out.println("Duplicate element array: " + "-->" + arr[i]);
                }
            }
        }
    }
}
