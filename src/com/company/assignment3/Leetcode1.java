package com.company.assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
//        int k = 0;
        int max = 0;
        int [][] accounts = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                accounts[i][j] = s.nextInt();
            }
        }
            for (int i = 0; i < accounts.length ; i++) {
                int k = 0;
                for (int j = 0; j < accounts[i].length; j++) {
                    k = k + accounts[i][j];
                }
                if (k > max){
                    max = k;
                }
//                System.out.println(accounts[i][k]);
        }
        System.out.println(max);
    }
}
