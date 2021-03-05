package com.company.lecture6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] alphabets = new char[5];
        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = s.next().charAt(0);
        }
        System.out.println(Arrays.toString(alphabets));
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
    }
}
