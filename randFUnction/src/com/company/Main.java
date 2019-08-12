package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

   static  int foo(){
       return 0;
   }

   public static int my_rand(){
       int i;
       i = 5*foo()+foo()-5;
       if(i<22)
           return i%7+1;
       return  my_rand();
   }
    public static void main(String[] args) {

        System.out.println(my_rand());
    }
}
