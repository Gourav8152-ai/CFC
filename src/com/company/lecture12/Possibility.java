package com.company.lecture12;

public class Possibility {
    public static void main(String[] args) {
        int row = 2, col = 3;
        int countways = maxe(row,col);
        System.out.println(countways);
    }

    private static int maxe(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }
        int count = 0;
        count += maxe(row-1,col);
        count += maxe(row, col-1);
        return count;
    }
}
