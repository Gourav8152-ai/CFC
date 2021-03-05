package com.company.lecture6;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] nums = {3, 7, 2, 9, 0, 5, 14, 17, 20, 21, 26, 32};
        bubble(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void bubble(int[] nums) {
//        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if(nums[j] > nums[j+1]) {
                    swap(nums, j, j+1);
                }
            }
        }
    }

    private static void swap(int[] nums, int j, int i) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
