package com.company.assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] image = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                image[i][j] = s.nextInt();
            }
        }

//        for (int i = 0; i < n ; i++) {
//            for (int j = 0; j < n; j++) {
//                image[i][j] = image[i][image.length-1-j];
//            }
//        }
//        System.out.println(Arrays.deepToString(image));
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (image[i][j] == 1){
//                    image[i][j] = 0;
//                }else {
//                    image[i][j] = 1;
//                }
//            }
//        }
//        System.out.println(Arrays.deepToString(image));
    }
}
