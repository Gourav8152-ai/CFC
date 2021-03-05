package com.company.assignment2;

public class CountPrime {
    public static void main(String[] args) {
        int[] a = {3, 8, 7, 9, 12, 11};
        int c = 0, k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 2; j < a[i]; j++) {
                if (a[i] % j == 0) {
                    c++;
                }
            }
        }
        if (c == 0) {
            k++;
        }
        System.out.println(k);
    }
}
