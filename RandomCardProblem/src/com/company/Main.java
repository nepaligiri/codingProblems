package com.company;


import java.lang.reflect.Array;
import java.util.*;

public class Main {

    private static void swap(int[]A, int i, int j){
        int temp = A[i];
        A[i] = A[j] ;
        A[j] = temp;
    }
     public static void shuffle(int A[]){
        for(int i =A.length -1;i>= 1;i--){
            Random randi = new Random();
            int j = randi.nextInt(i+1);
            swap(A,i,j);
        }
     }
      public static List<Integer> distribute(int []A){
          shuffle(A);
         // System.out.println(Arrays.toString(A));
          List<Integer> a = new ArrayList<>();
          for(int i=1;i<=3;i++){

              int   x = (int) Array.get(A,i);
              a.add(x);
          }
          System.out.println(  a  );
          return a;
    }

    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
            Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of person ");
       int t= scan.nextInt();
        if (t<=4) {
            switch(t) {
                case 1:
                    System.out.println("three cards for  are lok "  );
                    person lok = new person(distribute(A), "lok");
                    break;

                case 2:
                    System.out.println("three cards for  are indra  "  );
                    person indra = new person(distribute(A), "indra");
                    System.out.println("three cards for  are parag "  );
                    person parag = new person(distribute(A), "parag");
                    break;

                case 3:
                    System.out.println("three cards for   subodh are "  );
                    person subodh = new person(distribute(A), "subodh");
                    System.out.println("three cards for indra are"  );
                    person d = new person(distribute(A), "indra");
                    System.out.println("three cards for  parag are "  );
                    person e = new person(distribute(A), "parag");
                    break;

                case 4:
                    System.out.println("three cards for  indra  are "  );
                    person f = new person(distribute(A), "indra");
                    System.out.println("three cards for Asis are  "  );
                    person g = new person(distribute(A), "parag");
                    System.out.println("three cards for  Ganesh  are "  );
                    person h = new person(distribute(A), "lok");
                    System.out.println("three cards for  tinna are  "  );
                    person i = new person(distribute(A), "subodh");
                    break;
            }
            } else{
    System.out.println("insuffiecient no of cards. please Enter valid no");
    scan.nextInt();

                switch(t) {
                    case 1:
                        System.out.println("three cards for  are lok "  );
                        person lok = new person(distribute(A), "lok");
                        break;

                    case 2:
                        System.out.println("three cards for  are indra  "  );
                        person indra = new person(distribute(A), "indra");
                        System.out.println("three cards for  are parag "  );
                        person parag = new person(distribute(A), "parag");
                        break;

                    case 3:
                        System.out.println("three cards for subodh are "  );
                        person subodh = new person(distribute(A), "subodh");
                        System.out.println("three cards for indra are"  );
                        person d = new person(distribute(A), "indra");
                        System.out.println("three cards for  parag are  "  );
                        person e = new person(distribute(A), "parag");
                        break;

                    case 4:
                        System.out.println("three cards for  indra  are "  );
                        person f = new person(distribute(A), "indra");
                        System.out.println("three cards for lok are  "  );
                        person g = new person(distribute(A), "parag");
                        System.out.println("three cards for  parag  are "  );
                        person h = new person(distribute(A), "lok");
                        System.out.println("three cards for  subodh are  "  );
                        person i = new person(distribute(A), "subodh");
                        break;
                }
}
    }
    }


