package com.company;

import java.sql.SQLOutput;

public class Main {
    private static int [] room =new int[]{3, 0, 1, 3, 0, 5};

    public  static int unit (int n) {
        int left[] = new int [n];
         int right[] = new int[n];
         int water =0;
         left[0] = room[0];

         for(int i =1;i<n;i++){
             left[i] =Math.max(left[i-1],room[i]);
             System.out.println(left[i]);

         }
         right[n-1] = room [n-1];
        System.out.println("QQq"+right[n-1]);
         for(int i =n-2; i>= 0;i--){
             right[i] = Math.max(right[i+1],room[i]);
             System.out.println("######"+right[i]);
         }
         for(int i =0;i<n;i++){
             water += Math.min(left[i],right[i])-room[i];
             System.out.println("§§§§  "+left[i] +"  §§§§§  " +right[i]+ "   %%%%%%    " + room[i] +"  ''''''''''  "+water);
         }
         return water;
    }




    public static void main(String[] args) {

        System.out.println(unit(room.length));
    }
}
