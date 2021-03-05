package com.company.lecture10;

public class RecursionArr {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(sort(nums, 0));
    }

    private static boolean sort(int[] nums, int i) {
        if (i == nums.length-1) {
            return true;
        }
        if (nums[i] > nums[i+1]) {
            return false;
        }
        return sort(nums, i+1);
    }
}
