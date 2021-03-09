package com.company.assignment3;

public class Question13 {
    public static void main(String[] args) {
        int k = 2;
        int c = 0;
        int c1 = 0;
        String s = "abba";
        for (int i = 0; i < s.length(); i++) {
            if ((char)(s.charAt(i)) == 'a'){
                c++;
            }else {
                c1++;
            }
        }
        if (c > c1){
            System.out.println(c+k);
        }else {
            System.out.println(c1+k);
        }
    }
}
