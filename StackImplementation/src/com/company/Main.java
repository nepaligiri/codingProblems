package com.company;


import java.util.Stack;

public class Main {
   static Integer maxele;
    static Stack<Integer> stack ;


    static void push(int a){
        if (stack.isEmpty()) {
            maxele = a;
            stack.push(a);
            System.out.println("number inserted : " + a);

            return;
        }
        if(a< maxele) {
            stack.push(a);
            maxele=a;
        }
        else stack.push(a);
        System.out.println("number inserted:" +a);
    }

    static void pop(){
        if(stack.isEmpty())
            System.out.println("stack is empty");

        System.out.println("tope element removed");
        Integer t =stack.pop();

        if (t< maxele){
            System.out.println(t);
            maxele = t;
        }
    else
            System.out.println(t);
    }

   static   void findMax() {
        if (stack.isEmpty()) {
            System.out.println("stack is empty ");

        } else
            System.out.println("maximum element is " + maxele);
    }


    static  void peek(){
        if(stack.isEmpty()) {
            System.out.println("stack is empty");
            return;
        }
        Integer t = stack.peek();
        System.out.println(" top element is ");

        if(t<maxele)
            System.out.println(t);
        else
            System.out.println(maxele);
    }

    public static void main(String[] args) {
stack = new Stack<>();
        push(300);
      push(5);
      findMax();
        peek();
      pop();
      push(59);
      push(60);
      push(40);
      pop();
      findMax();
      peek();

    }
}
