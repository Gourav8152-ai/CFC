package com.company.lecture4;

public class PattBasic {
    public static void square(int n) {
        int row = 0;
        while (row < 5) {
        int col = 0;
            while (col < 5) {
                System.out.print(" * ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
    public static void main(String[] args) {
        square(5);

    }
}
