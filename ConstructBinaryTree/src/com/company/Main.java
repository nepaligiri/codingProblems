package com.company;


import java.util.EmptyStackException;
import java.util.Stack;

public class Main {


  static  boolean isOperator( char c){
        if (c== '+'|| c =='*'|| c== '-'|| c =='/'){
            return true;
        }
        return false;
    }

   static void inorder(Node t){
        if(t != null){

            inorder(t.left);
            System.out.println(t.value + " ");
            inorder(t.right);

        }
    }


     static Node constructTree(char  postfix[])
    {
        Stack<Node> st = new Stack<>();
        Node t,t1,t2;

        for(int i =0;i<postfix.length; i++){
            if(!isOperator(postfix[i])){
                t = new Node(postfix[i]);
                st.push(t);

            }else{
                t = new Node (postfix[i]);
                t1 =st.pop();
                t2 = st.pop();

                t.right = t1;
                t.left =t2;
                st.push(t);
            }

        }
        t =st.peek();
        st.pop();
        return t;



    }




    public static void main(String[] args) {

        String postfix = "*+ab+cd";
        char[] arr = postfix.toCharArray();
        Node root = constructTree(arr);
        inorder(root);

    }

}
class Node{
    char value;
    Node left ,right;


    Node( char item){
     item = value;
        left = right =null;
    }
}