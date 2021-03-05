package com.company.lecture6;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numo = {7, 11, 32, 43, 95, 105, 108};
        System.out.println(binoSearch(numo,95));
    }

    public static int binoSearch(int[] numo, int elt) {
        int start = 0, end = numo.length-1, mid;
        while(start <= end) {
            mid = (end + start)/2;
            if(numo[mid] == elt) {
                return mid;
            }
            else if(numo[mid] < elt){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
