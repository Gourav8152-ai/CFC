package com.company.assignment1;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        int second = s.nextInt();
        int gcd = 1;
        for (int i = 1; i <= first && i <= second; i++) {
                if (first % i == 0 && second % i == 0) {
                    gcd = i;
                }
            }
        System.out.println("GCD of " + first + " and " + second + " = " + gcd);
    }
}
