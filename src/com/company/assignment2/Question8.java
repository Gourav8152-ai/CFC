package com.company.assignment2;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a  = new int[10];
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
            if (a[i] % 5 == 0 ) {
                c++;
            }
        }
        System.out.println(c);
    }
}
