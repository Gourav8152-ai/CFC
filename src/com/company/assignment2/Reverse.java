package com.company.assignment2;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String m = Integer.toString(n);
        int res = 0;
        for (int i = 0; i < m.length(); i++) {
            int j = n % 10;
            n = n /10;
            res = res * 10 + j;
        }
        System.out.println(res);
    }
}
