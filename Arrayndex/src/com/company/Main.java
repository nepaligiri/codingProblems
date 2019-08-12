package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static int search1(int[] a, int target) {
        int start = 0;
        int last = a.length - 1;
        while (start + 1 < last) {
            int mid = start + (last - start) / 2;

            if (a[mid] == target)
                return mid;
            // if(a[start] < a[mid]) => Then this part of the array is not rotated
            if (a[start] < a[mid]) {
                if (a[start] <= target && target <= a[mid]) {
                    last = mid;
                } else {
                    start = mid;
                }
            }
            // this part of the array is rotated
            else {
                if (a[mid] <= target && target <= a[last]) {
                    start = mid;
                } else {
                    last = mid;
                }
            }
        } // while
        if (a[start] == target) {
            return start;
        }
        if (a[last] == target) {
            return last;
        }
        return -1;
    }


    public static void main(String[] args) {
        int [] a = {13, 18, 25, 2, 8, 10};

        int b = 13;

        System.out.println(search1(a,b ));
    }
}
