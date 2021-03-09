package com.company.assignment3;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 4;
        int[][] n = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                n[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0){
                    System.out.print(n[j][i] + " ");
                }else if (i == 3 && j ==3){
                    for (j = 3; j >= 0 ; j--) {
                        System.out.print(n[j][i] + " ");
                    }
                }else if (i == 3) {
                    for (i = 3; i > 0 ; i--) {
                        System.out.print(n[i][j] + " ");
                    }
                }else if (j == 3){
                    System.out.print(n[i][j] + " ");
                }
            }
        }
    }
}
// STIll INCOMPLETESTIll INCOMPLETESTIll INCOMPLETESTIll INCOMPLETESTIll INCOMPLETESTIll INCOMPLETESTIll INCOMPLETE