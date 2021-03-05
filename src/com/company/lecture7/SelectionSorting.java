package com.company.lecture7;

import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] nums = {10,8,1,6,4,6,0};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int max = maxIndex(nums,0,nums.length-i);
            swap(nums,max,nums.length-1-i);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    private static int maxIndex(int[] nums, int ind1, int ind2) {
        int max = ind1;
        for (int i = 0; i < ind2; i++) {
            if (nums[i] > nums[max]) {
                max = i;
            }

        }
        return max;
    }
}
