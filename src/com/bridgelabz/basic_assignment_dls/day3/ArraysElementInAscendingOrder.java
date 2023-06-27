package com.bridgelabz.basic_assignment_dls.day3;

import java.util.Arrays;

public class ArraysElementInAscendingOrder {
    public static void main(String[] args) {
        int[] arr = {23,5,6,67,45};
        Arrays.sort(arr);
        for (int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
