package com.bridgelabz.basic_assignment_dls.day3;

import java.util.Arrays;

public class FrequencyOfArrays {
    public static void main(String[] args) {
        int[] arr = {2,6,8,2,5,9,1,11,34,1,9,45,9};
        Arrays.sort(arr);
        int i,j, frequency;
        for (i=0; i< arr.length; i++){
            frequency = 1;
            for (j=i+1; j< arr.length; j++){
                if (arr[i] == arr[j]){
                    frequency++;
                }else {
                    break;
                }
            }
            i=j-1;
            if (frequency>1){
                System.out.println("Frequency of arrays " + "-->" + frequency);
            }
        }
    }
}
