package com.company.assignment1;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        int row = 0, n =5;
        while (row < n) {
            int col = 0;
            while (col <= row) {
                System.out.print(" * ");
                 col++;
            }
            System.out.println();
            row++;
        }

    }
}
