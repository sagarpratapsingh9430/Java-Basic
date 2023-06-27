package com.bridgelabz.basic_assignment_dls.day3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysSecondLargestElement {
    public static void main(String[] args) {
       int[] arr = {34,67,41,23,34,9,5,1};
       int temp=0;
       for (int i=0; i< arr.length; i++){
           for (int j=i+1; j<arr.length; j++){
               if (arr[i]>arr[j]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
       }
        System.out.println("Second largest element of an array: " + arr[arr.length-2]);
    }
}
