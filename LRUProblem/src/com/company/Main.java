package com.company;

import java.util.HashMap;

public class Main {



     static HashMap <Integer,Entery> hashMap;

   static Entery start, end;
   static int LRU_SIZE =4;

    public Main() {
    hashMap = new  HashMap<Integer,Entery>();
    }

    public static int getEntery(int key)
    {
        if (hashMap.containsKey(key)){
            Entery entery = hashMap.get(key);
            removeNode(entery);
            addToTop(entery);
            return entery.value;
        }
         return -1;

    }


    public  static void putEntery (int key, int value){


        if(hashMap.containsKey(key)){
            Entery entry = hashMap.get(key);
            entry.value = value;
            removeNode(entry);
            addToTop(entry);
        }else{
            Entery newnode = new Entery();
            newnode.left = null;
            newnode.right =null;
            newnode.value = value;
            newnode.key= key;
            if(hashMap.size()>LRU_SIZE){
                hashMap.remove(end.key);
                removeNode(end);
                addToTop(newnode);

            }else{
                addToTop(newnode);

            }
            hashMap.put(key, newnode);
        }
    }

    public  static void addToTop(Entery node){
        node.right = start;
        node.left = null;

        if (start != null)
            start.left = node;


        start = node;
        if (end == null)
            end = start;


    }

    public  static void removeNode(Entery node){
        if(node.left!= null){
            node.left.right = node.right;

        }else{
            start = node.right;
        }
        if(node.right!= null){
            node.right.left = node.left;
        }else{
            end = node.left;
        }
    }

    public static void main(String[] args) throws java.lang.NullPointerException{


       Main one = new Main();
        one.putEntery(10, 15);
        one.putEntery(15, 10);
        one.putEntery(10, 16);
        one.putEntery(12, 15);
        one.putEntery(18, 10);
        one.putEntery(13, 16);

        System.out.println(one.getEntery(1));
        System.out.println(one.getEntery(10));
        System.out.println(one.getEntery(15));
        System.out.println(one.getEntery(12));
        System.out.println(one.getEntery(18));

    }
}
