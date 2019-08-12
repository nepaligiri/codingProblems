package com.company;

public class Main {
    static final int INT_SIZE = 32;
    static int getSingle(int arr[],int n) {
    //    int ones = 0, twos = 0;
      //  int common_bit_mask;
     //   for (int i = 0; i < n; i++){
      //      twos = twos | (ones & arr[i]);
       //     ones = ones ^ arr[i];
        //    common_bit_mask = ~(ones & twos);
         //   ones &= common_bit_mask;
       //     twos &= common_bit_mask;
      //  }
      //  return ones;

int result =0;
int x, sum;
 for (int i = 0; i < INT_SIZE; i++){
    sum =0;
    x = (1<<i);
    for (int j =0;j<n;j++){
        if ((arr[j]& x)==0)
        sum++;
    }
    if (( sum%3)==0)
        result |=x;


        }
 return result;


    }


    public static void main(String[] args) {
        int[] arr = {2,4,6,2,4,6,9};
        int n =arr.length;
        System.out.println(getSingle(arr,n));

    }
}
