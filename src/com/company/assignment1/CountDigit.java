package com.company.assignment1;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int digit = s.nextInt();
        int c = 0;
        while (digit != 0) {
            digit = digit / 10;
            c++;
        }
        System.out.println("count of digit : " + c);
    }
}
