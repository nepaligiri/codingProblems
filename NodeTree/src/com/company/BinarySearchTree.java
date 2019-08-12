package com.company;



public class BinarySearchTree {

    Node root;

    BinarySearchTree(){
        root = null;
    }

    public void insert(int data){
        this.root = this.insertRec(this.root,data);
    }

    Node insertRec(Node node,int data){
        if(node == null){
            this.root = new Node(data);
            return this.root;
        }
        if(data< node.data){
            node.left= this.insertRec(node.left,data);
        }else{
            node.right = this.insertRec(node.right,data);

        }
        return node;
    }

    void secLele(Node node,Count C) {
        if (node == null || C.c >= 2)
            return;

        this.secLele(node.right, C);

        C.c++;
        if(C.c ==2){
            System.out.println(" second largest element is " + node.data);
            return;
        }
        this.secLele(node.left,C);

    }
    void second (Node node){
        Count C = new Count();
        this.secLele(this.root,C);
    }
}
