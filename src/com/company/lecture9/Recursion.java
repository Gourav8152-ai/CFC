package com.company.lecture9;

public class Recursion {
    public static void main(String[] args) {
        print(5);
    }

    public  static void print(int n ){
        if (n==0) {
            return;
        }
        print(n-1);
    }
}
