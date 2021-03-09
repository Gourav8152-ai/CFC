package com.company.assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
        int n = 4;
        int[] first = {3,5,0,7};
//        for (int i = 0; i < n; i++) {
//            first[i] = s.nextInt();
//        }
        int m = 4;
        int[] second = {9,0,2,8};
//        for (int i = 0; i < m; i++) {
//            second[m]= s.nextInt();
//        }
        System.out.println(Arrays.toString(sumOfArray(first,second)));
    }

    private static int[] sumOfArray(int[] first, int[] second) {
        for (int i = 0; i < first.length & i < second.length; i++) {
            int a = first[first.length-1-i] + second[second.length-1-i];
            int z = a % 10;
            a = a / 10;
            first[first.length-1-i] = z ;
            first[first.length-2-i] = first[first.length-2-i]  + a ;
        }
        return first;
    }
}
