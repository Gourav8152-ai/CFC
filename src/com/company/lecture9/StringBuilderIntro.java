package com.company.lecture9;

public class StringBuilderIntro {
    public static void main(String[] args) {
        String str = "Gopu";
        StringBuilder stringBuilder = new StringBuilder("Ekta");
        for (int i = 0; i < 1000000; i++) {
            stringBuilder.append("a");
        }
        System.out.println(stringBuilder);
    }
}
