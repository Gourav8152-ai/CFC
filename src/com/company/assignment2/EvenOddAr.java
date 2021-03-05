package com.company.assignment2;

import java.util.Arrays;

public class EvenOddAr {

        public static void main(String[] args) {
            int[] nums = {3,8,5,13,6,12,18,5};
            sort(nums);
        }

        private static void sort(int[] nums) {
            int c = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 == 0) {
                    c++;
                }
            }
            for (int j = 0; j < nums.length; j++) {
                if (j < c) {
                    if (nums[j] % 2 == 0) {
                        nums[j] = nums[j];
                        j++;
                    } else {
                        nums[j] = nums[j];
                        j++;
                    }
                }
            }
            System.out.println(c);
            System.out.println(Arrays.toString(nums));
        }
    }
