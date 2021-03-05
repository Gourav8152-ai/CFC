package com.company.assignment3;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] n = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                n[i][j]  = s.nextInt();
            }
        }
    }
}
