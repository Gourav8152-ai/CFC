package com.company.lecture4;
public class PattBasicFour {
    public static void halfdia(int n) {
        int rowmirr = 0;
        int row = 0;
        while (rowmirr < 2 * n - 1) {
            int col = 0;
            while (col < n - row) {
                System.out.print(" * ");
                col++;
            }
            System.out.println();

            if(rowmirr < n-1){
                row++;
            }else {
                row--;
            }
            rowmirr++;
        }
    }
    public static void main(String[] args) {
        halfdia(5);
    }
}
