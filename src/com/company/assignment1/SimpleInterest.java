package com.company.assignment1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount : ");
        int amount = s.nextInt();
        System.out.println("Enter the rate : ");
        int rate = s.nextInt();
        System.out.println("Enter the time : ");
        int time = s.nextInt();

        int i = (amount * rate * time)/ 100 ;
        System.out.println("Simple Interest of the User : " + i);
    }
}
