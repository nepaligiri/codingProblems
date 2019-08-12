package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static <T> List<List<T>> powerSet(List<T> input) {
        List<List<T>> sets = new ArrayList<>();
        System.out.println(sets);

        for (T element : input) {
            System.out.println(input +"''######");

            for (ListIterator<List<T>> setsIterator = sets.listIterator(); setsIterator.hasNext(); ) {
                System.out.println("**********+++++ " +setsIterator);

                List<T> newSet = new ArrayList<>(setsIterator.next());
                newSet.add(element);
                System.out.println(element);

                setsIterator.add(newSet);
                System.out.println("##########"+ newSet);
            }
            sets.add(new ArrayList<>(Arrays.asList(element)));
        }
        sets.add(new ArrayList<>());
        return sets;
    }

    public static void main(String[] args) {
	// write your code here

     List<Character>   set = new ArrayList<Character>();
     set.add('A');
     set.add('B');
     set.add('C');
     set.add('D');

        System.out.println(powerSet(set));
    }
}
