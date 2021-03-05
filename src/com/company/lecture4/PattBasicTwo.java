package com.company.lecture4;

public class PattBasicTwo {
    public static void traingle(int n) {
        int row = 0;
        while (row < 5) {
            int col = 0;
            while (col < n) {
                if (col <= row) {
                    System.out.print(" * ");
                }
                col++;
            }
            System.out.println();
            row++;
        }
    }
    public static void main(String[] args) {
        traingle(5);
    }
}
