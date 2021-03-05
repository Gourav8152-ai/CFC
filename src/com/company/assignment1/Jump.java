package com.company.assignment1;

import java.util.Scanner;

public class Jump {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int last = s.nextInt();
        int even = 2;
        for (int i = 0; i <= last; i++) {
            if (even % 2 == 0) {
                int value = even + (4 * i);
                System.out.print(value + " ");
                even = value;
            }
        }
    }
}
