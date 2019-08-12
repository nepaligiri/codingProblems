package com.company;

import java.util.*;

public class Main {
         static Stack<Integer> s1 = new Stack<>();
          static  Stack<Integer> s2 = new Stack<>();


      public static void enQueue(int x){
            while( !s1.isEmpty()){
                s2.push(s1.pop());

            }
            s1.push(x);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }


        }


     static  int deQueue( ){
          if(s1.isEmpty()){
              System.out.println(
                     " q is empty"  );
              System.exit(0);
          }
          int x = s1.peek();
          s1.pop();
          return x;
        }

    public static void main(String[] args) {
        enQueue(1);
        enQueue(2);
        enQueue(3);

        System.out.println(deQueue());
        System.out.println(deQueue());
        System.out.println(deQueue());

    }
}
