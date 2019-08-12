package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static boolean  iSsubsetSum (int set[],int n,int sum){
        if(sum ==0)
        return true;
        if(n==0 && sum != 0)
         return false;

        if (set[n-1]>sum)
            return iSsubsetSum(set,n-1,sum);

        return iSsubsetSum(set,n-1,sum)||iSsubsetSum(set,n-1,sum-set[n-1]);

    }
    public static void main(String[] args) {
        int set[] = {3, 34, 4, 12, 5, 2};
        int sum = 57;
        int n = set.length;
        if (iSsubsetSum(set, n, sum) == true)
            System.out.println("Found a subset"
                    + " with given sum");
        else
            System.out.println("No subset with"
                    + " given sum");
    }
}


