package com.company;

public class Main {

    static  void printSubStr (String str,int low, int high){
        System.out.println(str.substring(low,high+1));
    }

    public static int palindrome (String a){
        int n = a.length();

        boolean table [][] = new boolean[n][n];
        int max = 1;
        for(int i = 0;i<n;i++)
            table[i][i] = true;



        int start =0;
        for(int i =0;i<n-1;i++){
            if (a.charAt(i)== a.charAt(i+1)){
                table[i][i+1] = true;
                start =i;
                max =2;
            }
        }

        for(int k =3;k<n; ++k){
            for(int i =0;i<n-k+1;++i){
                int j = i+k-1;


                if(table[i+1][j-1]&& a.charAt(i) == a.charAt(j)){
                    table[i][j] = true;

                    if(k>max){
                        start =i;
                        max = k;
                    }
                }
            }
        }
        System.out.println("longest palindrome substring is; ");

        printSubStr(a,start,start+max-1);
        return max;

    }

    public static void main(String[] args) {
        String st ="banananas";
        System.out.println(palindrome(st));

    }
}
