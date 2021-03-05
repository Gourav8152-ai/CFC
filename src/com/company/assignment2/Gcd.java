package com.company.assignment2;

public class Gcd {
    public static void main(String[] args) {
        int a = 28, b = 20;
        greates(a, b);
    }

    private static void greates(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
