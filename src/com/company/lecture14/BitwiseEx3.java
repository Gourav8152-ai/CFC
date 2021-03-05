package com.company.lecture14;

public class BitwiseEx3 {
    //CODE TO FIND THE ODD ONE USING XOR
    public static void main(String[] args) {
        int[] nums = {2,3,8,6,2,7,3,3,8};
//        oddOne(nums);
        System.out.println(oddOne(nums));
    }

    private static int oddOne(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
