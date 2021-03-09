package com.company.assignment3;

public class Question12 {
    public static void main(String[] args) {
        String s = "acbd";
        String result = "";
        for (int i = 0; i < s.length()-1; i++) {
            int res = s.charAt(i+1) - s.charAt(i);
//            System.out.println(res);
            result =  result + Character.toString(s.charAt(i))+res;
        }
        System.out.print(result+s.charAt(s.length()-1));
    }
}