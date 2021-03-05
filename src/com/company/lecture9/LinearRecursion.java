package com.company.lecture9;

public class LinearRecursion {
    public static void main(String[] args) {
        int[] nums = {2,5,7,8,9,10};
        int target = 8;
        System.out.println(linear(nums,target,5));
    }

    public static int linear(int[] nums, int target, int ind) {
        if (ind == nums.length){
            return -1;
        }
        if (nums[ind] == target){
            return ind;
        }
        return linear(nums,target,ind+1);
    }
}
