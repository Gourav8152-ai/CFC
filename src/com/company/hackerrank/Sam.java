package com.company.hackerrank;

import java.util.Scanner;

public class Sam {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 0, k = 0;
        int t = s.nextInt();
        for (int i = 0; i < t && (t >= 1 && t <= 100000); i++) {
            n = s.nextInt();
            k = s.nextInt();
            if (n < k) {
                System.out.println(n);
            } else {
                n = n - k;
                k = n - k;
                if (k >= 0 && k <= 1000000000) {
                    System.out.println(k);
                } else if (k < 0) {
                    System.out.println(0);
                }
            }
        }
    }
}