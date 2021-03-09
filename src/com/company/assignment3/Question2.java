package com.company.assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] n = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                n[i][j]  = s.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(n[i][j] + " ");
                }
            }else {
                for (int j = 3; j >= 0 ; j--)
                    System.out.print(n[i][j] + " ");
            }
        }
    }
}
