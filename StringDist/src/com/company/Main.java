package com.company;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    static char[] orderElement(char []w,int size) {
        int p =0;
        int q = size -1;
        int i;
        char t;
        for(i=0;i<=q;){
            if(w[i] =='R'){
                t = w[i];
                w[i]=w[p];
                w[p]= t;
                ++p;
                ++i;
            }
            else if(w[i]=='G'){
                t = w[i];
                w[i] = w[q];
                w[q] =t;
                --q;
            }
            else{
                i++;
            }

        }
        return w;

    }

    public static void main(String[] args) {
        char y[] ={'G', 'B', 'R', 'R', 'B', 'R', 'G'};

        System.out.println(orderElement(y,7));

    }

}


