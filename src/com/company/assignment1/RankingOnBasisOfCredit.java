package com.company.assignment1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RankingOnBasisOfCredit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the credit you wish to give to the Campus Leader");
        int credit = s.nextInt();
        if (credit < 4500) {
            System.out.println("Rising Star");
        }
        else if (credit >= 4500 && credit < 6000) {
            System.out.println("Mega Leader");
        }
        else if (credit >= 6000 && credit < 7500) {
            System.out.println("Gega Leader");
        }
        else {
            System.out.println("Tera Leader");
        }

    }
}
