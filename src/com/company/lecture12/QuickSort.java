package com.company.lecture12;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {4,1,7,3,2,0};
        quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    private static void quickSort(int[] nums, int start, int end) {
        if (start >= end){
            return;
        }
        int pos = pivot(nums,start, end);
        quickSort(nums,start,pos-1);
        quickSort(nums,pos+1,end);
    }

    private static int pivot(int[] nums, int start, int end) {
        int ind = start;
        for (int i = start; i < end; i++) {
            if (nums[i] < nums[end]) {
                swap(nums,ind,i);
                ind++;
            }
        }
        swap(nums,ind,end);
        return ind;
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
