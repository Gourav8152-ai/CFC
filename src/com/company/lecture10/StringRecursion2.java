package com.company.lecture10;

public class StringRecursion2 {
    public static void main(String[] args) {
        String str = "abc";
        permuatations("", str);
    }

    private static void permuatations(String proc, String unproc) {
        if (unproc.isEmpty()) {
            System.out.println(proc);
            return;
        }

        char ch = unproc.charAt(0);
        unproc = unproc.substring(1);

        for (int i = 0; i < proc.length(); i++) {
            String first = proc.substring(0,i);
            String second = proc.substring(1);
            permuatations(first+ch+second,unproc);
        }
    }
}
