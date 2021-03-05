package com.company.lecture10;

public class PattRecur {
    public static void main(String[] args) {
        int row = 5, col= 0;
        printStar(row,col);
    }

    private static void printStar(int row, int col) {
        if (row == 0){
            return;
        }
        if (row == col){
            System.out.println();
            printStar(row-1,0);
            return;
        }
        System.out.print("* ");
        printStar(row,col+1);
    }
}
