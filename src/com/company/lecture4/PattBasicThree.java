package com.company.lecture4;

public class PattBasicThree {
    public static void downtraingle(int n) {
        int row = 0;
        while (row < 5) {
            int col = 0;
            int dif = n - row;
            while (col < n) {
                if (col < dif) {
                    System.out.print(" * ");
                }
                col++;
            }
            System.out.println();
            row++;
        }
    }
    public static void main(String[] args) {
        downtraingle(5);
    }
}
