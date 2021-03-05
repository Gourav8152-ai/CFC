package com.company.lecture8;

import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        String s = "Gopu";
        String s1 = "Gopuchand";
        //.equals will compare value in string
        if (s.equals(s1)) {
            System.out.println("Hey");
        }
        System.out.println(s.length());
        System.out.println(s.substring(1));
        System.out.println(s1.substring(4,8));
        System.out.println(s1.indexOf('h'));
        System.out.println(s1.toLowerCase());
    }
}
