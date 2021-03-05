package com.company.assignment1;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = 0, c = 0;
        while( n != 0) {
            int num = n % 10;
            r = r * 10 + num;
            n = n/10;
        }
        System.out.println(r);
    }
}
