package com.company.lecture10;
public class Patt2Recur {
    public static void main(String[] args) {
        int row = 5, col= 0;
        printStar(row,col);
    }

    private static void printStar(int row, int col) {
        if (row == 0){
            return;
        }
        if (row == col){
            printStar(row-1,0);
            System.out.println();
            return;
        }
        printStar(row,col+1);
        System.out.print("* ");
    }
}
