package com.company.lecture5;

public class Reverse {
    public static void main(String[] args) {
        int num = 39526;
        int rev = reverseInt(num);
        System.out.println(rev);
    }

    public static int reverseInt(int n) {
        int res = 0;
        while(n > 0) {
            int rem = n % 10;
            n = n / 10;
            res = res * 10 + rem;
        }
        return res;
    }
}
