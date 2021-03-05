package com.company.assignment1;

import java.util.Scanner;

public class Pattern5 {

    public static void main(String[] args) {
        int row = 0, n = 5;
        Scanner s = new Scanner(System.in);
        while (row < n) {
            int col = 0;
            while (col <= row) {
                System.out.print(col + 1 + " ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
