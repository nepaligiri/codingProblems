package com.company;

public class Main {

    public static  int expon(int x,int y ){
        if(y==0)
            return 1;

        else if(y%2 ==0)
            return expon(x,y/2)* expon(x,y/2);


        else
            return x* expon(x, y/2)* expon(x,y/2);

    }

    public static void main(String[] args) {
        System.out.println(expon(2,2));
    }
}
