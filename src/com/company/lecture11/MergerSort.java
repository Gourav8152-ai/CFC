package com.company.lecture11;

import java.util.Arrays;

public class MergerSort {
    // This code can be used when we get both the sorted arrays.
    //Merge Sort has also similar implementation.
    public static void main(String[] args) {
        int[] first = {0,1,3,7,8,9};
        int[] second = {2,3,6,9,10,14};
        int[] third = merge(first,second);
        System.out.println(Arrays.toString(third));
        int[] nums = {7,8,10,4,9,8,54,1,4,8};
        nums = mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static int[] mergeSort(int[] nums) {
        if (nums.length < 2) {
            return nums;
        }
        int mid = nums.length/2;
        int[] first = Arrays.copyOfRange(nums,0,mid);
        int[] second = Arrays.copyOfRange(nums,mid,nums.length);
        first = mergeSort(first);
        second = mergeSort(second);
        return merge(first,second);
    }

    private static int[] merge(int[] first, int[] second) {
        int i=0 , j=0 , k=0;
        int[] third = new int[first.length+ second.length];
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                third[k++] = first[i++];
            } else {
                third[k++] = second[j++];
            }
        }
        while (i < first.length) {
            third[k++] = first[i++];
        }
        while (j < second.length) {
            third[k++] = second[j++];
        }
        return third;
    }
}
