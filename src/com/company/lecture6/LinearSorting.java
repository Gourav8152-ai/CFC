package com.company.lecture6;

public class LinearSorting {
    public static void main(String[] args) {
        int[] nums = {3, 7, 2, 9, 0, 5};
        System.out.println(linearsearch(nums, 9));
    }

    public static int linearsearch(int[] nums, int elt) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == elt) {
                return i;
            }
        }
        return -1;
    }
}