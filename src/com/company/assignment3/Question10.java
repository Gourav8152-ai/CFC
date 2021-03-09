package com.company.assignment3;

public class Question10 {
    public static void main(String[] args) {
        String s = "abcg";
        for (int i = 0; i < s.length(); i++) {
            if(i % 2 ==0){
                System.out.print((char) ((s.charAt(i))+1));
            }else {
                System.out.print((char) ((s.charAt(i))-1));
            }
        }
    }
}
