package com.company.lecture4;

public class PattAdv {
    public static void left(int n) {
        int row = 0;
        while (row < n) {
            int col = 0;
            while (col < n) {
                if (col < row) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
                col++;
            }
            System.out.println();
            row++;
        }
    }
    public static void main(String[] args) {
        left(10);
    }
}

