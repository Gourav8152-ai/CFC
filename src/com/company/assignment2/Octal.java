package com.company.assignment2;

import java.util.Scanner;

public class Octal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int n = 90;
        int rem;

        String str = "";
        char[] dig={'0','1','2','3','4','5','6','7'};
        while(n>0){
            rem = n%8;
            str=dig[rem]+str;
            n=n/8;
        }
        System.out.println("Decimal to octal: "+str);
    }
}
