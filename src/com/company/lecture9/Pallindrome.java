package com.company.lecture9;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        str = str.toLowerCase();
        System.out.println(isPalindrome(str));

    }
    public  static boolean isPalindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                return  false;
            }
        }
        return true;
    }
}
