package com.company.assignment2;


public class Uppercas {
    public static void main(String[] args) {
        char j = 'Z';
        identify(j);
    }

    private static void identify(char j) {
        if (j >= 65 && j <= 90) {
            System.out.println("Uppeercase");
        }else if (j >= 97 && j <=122){
            System.out.println("Lowercase");
        } else {
            System.out.println("none");
        }
    }
}