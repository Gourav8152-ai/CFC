package com.company.lecture9;

public class RecursionFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }

    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        return n*factorial(n-1);
    }
}
