package com.company.lecture5;

public class DecToBin {
    public static void main(String[] args) {
        int num = 13;
        int res = decToBin(num);
        System.out.println(res);
    }

    public static int decToBin(int num) {
        int res = 0;
        int place = 1;
        while(num >0) {
            int rem = num % 2;
            num = num / 2;
            res =  res + place * rem;
            place  = place * 10;

        }
        return(res);
    }


}
