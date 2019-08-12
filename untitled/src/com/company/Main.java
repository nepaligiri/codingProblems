package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main{

    public static List< List<Integer>> subset (List<Integer>aa) {
        List< List<Integer>> set = new ArrayList<>();
        for ( int t : aa){
            for(ListIterator<List<Integer>> a = set.listIterator(); a.hasNext();){
                List<Integer> b = new ArrayList<>(a.next());
                b.add(t);
                a.add(b);

            }
            set.add(new ArrayList<>(Arrays.asList(t)));

        }
        set.add(new ArrayList<>());
        return set;

    }





    public static void main(String[] args) {
        List<Integer>   set = new ArrayList<>();
        set.add(4);
        set.add(6);
        set.add(3);
        System.out.println(subset(set));

    }
}
