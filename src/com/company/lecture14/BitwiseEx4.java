package com.company.lecture14;

public class BitwiseEx4 {
    public static void main(String[] args) {
        int[]  nums = {2,7,6,3,9,6,2,3};
        odd(nums);
    }

    private static void odd(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res = res ^ num;
        }
        int xor = res, pos = 0;
        while ((xor & 1)!= 1) {
            pos++;
            xor = xor >>1;
        }
        int mask= 1 <<pos;
        int first = 0,second;
        for (int num : nums) {
            if((num & mask) >= 1) {
                first = first ^ num;
            }
        }
        second = res ^ first;
        System.out.println(first + " : " + second);
    }
}
