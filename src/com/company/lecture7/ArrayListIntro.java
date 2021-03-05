package com.company.lecture7;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        System.out.println(list);
        list.add(2,6);
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(3);
        System.out.println(list);
        list.add(0,9);
    }
}
