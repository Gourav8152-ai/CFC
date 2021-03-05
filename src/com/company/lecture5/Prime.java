package com.company.lecture5;

public class Prime {
    public static void main(String[] args) {
        int num = 6;
        boolean check = prime(num);
        System.out.println(check);
    }

    private static boolean prime(int num) {
        int c = 0;
        for(int i = 2 ; i*i <= num ; i++) {
            if(num % i ==0) {
               return false;
            }
        }
        return true;
    }
}
