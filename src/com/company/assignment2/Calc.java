package com.company.assignment2;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        char ch = s.next().charAt(0);
        int n2 = s.nextInt();
        System.out.println(cal(n1, n2, ch));
    }

    private static int cal(int n1, int n2, char ch) {
        int res = 0;
        if (ch == '%') {
            res = n1 % n2;
        } else if (ch == '/') {
            res = n1 / n2;
        } else if (ch == '*') {
            res = n1 * n2;
        } else if (ch == '+') {
            res = n1 + n2;
        } else if (ch == '-') {
            res = n1 - n2;
        }else {
            return -1;
        }
        return res;
    }
}
