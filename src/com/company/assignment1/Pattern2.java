package com.company.assignment1;

public class Pattern2 {
    public static void main(String[] args) {
        int row = 0, n =5;
        while (row < n) {
            int col = 0;
            while (col <= row) {
                System.out.print(col+1 + " ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
