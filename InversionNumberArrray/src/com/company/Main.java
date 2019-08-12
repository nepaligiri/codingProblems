package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private static List<Map<Integer, Integer>> aa= new ArrayList();

    private static List<Integer> arrr = new ArrayList<>();

    static List<Map<Integer, Integer>> inversion(List<Integer>arrr){
        int p =0;
        while( p< arrr.size()) {
            int a = arrr.get(p);

        for(int i =1;i<arrr.size();i++) {
            Map<Integer, Integer> ee = new HashMap<>();

            if(p<i) {
                if (a > arrr.get(i)) {
                    int b =arrr.get(i);
                    ee.put(a, b);

                    aa.add(ee);

                }
            }

        }
        p++;

        }

        return aa;
    }


    public static void main(String[] args) {
        arrr.add(7);
        arrr.add(9);
        arrr.add(5);
        arrr.add(3);
        arrr.add(6);
        arrr.add(1);
        System.out.println( inversion(arrr));

    }
}
