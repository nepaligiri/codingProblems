package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int encode (String a) throws NullPointerException{
        Map<Character,Integer> dict = new HashMap<>();
        dict.put('I', 1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('L', 50);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000);
        char s = a.charAt(0);
        char b;
        int  cv = dict.get(s);
        int bv;
        System.out.println("value of cv: " +cv);
        int r = cv;
        int i =1;
                while(i<a.length()){
                    b = a.charAt(i);
                    System.out.println(b);
                    bv = dict.get(b);
                    System.out.println(bv);
                    r += bv;
                    System.out.println(r);
                    if(bv>cv){
                        System.out.println(bv);
                        r -= 2*cv;
                        System.out.println(cv);
                        System.out.println(r);

                    }
                    cv=bv;
                    i++;

                }
                return r;

    }




public static void main(String[] args) {
    System.out.println(encode("CXMV"));
}

}
