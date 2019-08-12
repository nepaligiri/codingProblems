package com.company;



public class Main {





    public static void main(String[] args) {
        BinarySearchTree bst= new BinarySearchTree();
        bst.insert(50);
        bst.insert(49);
        bst.insert(56);
        bst.insert(67);
        bst.insert(87);
        bst.insert(49);
        bst.insert(54);
        bst.insert(78);
        bst.insert(65);

       bst.second(bst.root);
    }

    }




