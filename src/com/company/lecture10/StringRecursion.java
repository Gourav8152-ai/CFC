package com.company.lecture10;

public class StringRecursion {
    public static void main(String[] args) {
        String str = "abc";
        subsequence("",str);
    }

    private static void subsequence(String proc, String unproc) {
        if (unproc.isEmpty()) {
            System.out.println(proc);
        }
        char ch = unproc.charAt(0);
        unproc = unproc.substring(1);

        subsequence(unproc,proc);
    }
}
