package com.company.lecture14;

public class BitwiseEx2 {
    public static void main(String[] args) {
        int  n = 17, p=0 ;
        System.out.println(countSetBits(n));
//        System.out.println(Odd(n));
    }

//    private static boolean Odd(int n) {
//        return (n&1) == 1;
//    }

    private static int countSetBits(int n) {
        int cnt = 0;
        while (n > 0) {
            if ((n&1) == 1) {
                cnt++;
            }
            n= n >>1;
        }
        return cnt;
    }

}

