package com.company.assignment2;

public class Lcm {
    public static void main(String[] args) {
        int a = 72, b = 60;
        lcmo(a, b);
    }

    private static void lcmo(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("LCM :" + ((a *b)/gcd));
    }
}
