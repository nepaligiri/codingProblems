package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
     public static int minimumCost (List<Integer> t){

         int min ;
         int b =t.get(0);
         for(int i=1;i<t.size();i++){

             if( b>t.get(i)){
                 b= t.get(i);

             }
         }
         System.out.println(b);
         return b;

     }
    public static int cost(List<Integer> t){

        int a =t.size()-1;

        int b =t.get(a);
        System.out.println(b);

        return b;


    }

    public static void main(String[] args) {
       List<Integer> a= new ArrayList<>();
       a.add(9);
       a.add(11);
        a.add(3);
       a.add(8);
       a.add(7);
       a.add(5);
       a.add(10);



        System.out.println(cost(a)-minimumCost(a) );
    }
}
