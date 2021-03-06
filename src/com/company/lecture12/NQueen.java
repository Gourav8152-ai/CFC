package com.company.lecture12;

import java.util.Arrays;

public class NQueen {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        nQueens(board,0);
    }

    private static void nQueens(boolean[][] board, int row) {
        if (row == board.length){
            System.out.println(Arrays.deepToString(board));
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board,row,i)) {
                board[row][i] = true;
                nQueens(board,row+1);
                board[row][i] = false;
            }
        }
    }

    private static boolean isSafe(boolean[][] board, int row,int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        int leftDiag = Math.min(row,col);
        for (int i = 1; i <= leftDiag; i++) {
            if (board[row-1][col-1]){
                return false;
            }
        }
        int rightDiag = Math.min(row, board.length-col-1);
        for (int i = 1; i <= rightDiag; i++) {
            if (board[row-1][col+1]){
                return false;
            }
        }
        return true;
    }
}
