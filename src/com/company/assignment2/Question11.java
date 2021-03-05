package com.company.assignment2;

import java.util.Arrays;

public class Question11 {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,1,0,0,0,1,0,0,1,1};
        sort(nums);
    }

    private static void sort(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                c++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (j < c) {
                nums[j] = 0;
            }else {
                nums[j] = 1;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
