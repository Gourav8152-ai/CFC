package com.company.assignment3;

public class Question9 {
    public static void main(String[] args) {
        int n = 7;
        int sub = 4;
        int[] arr = {2,5,-1,7,-3,-1,-2};
        int sum = 0;
        for (int i = 0; i < arr.length-sub+1; i++) {
            int max= arr[i];
            int min = arr[i];
            for (int j = i+1; j < sub+i; j++) {
                if (arr[j] > max){
                    max = arr[j];
                }
                if (arr[j] < min){
                    min = arr[j];
                }
            }
            sum = sum + max + min;
        }
        System.out.println(sum);
    }
}
