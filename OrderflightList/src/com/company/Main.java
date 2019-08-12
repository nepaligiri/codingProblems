package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    // [('SFO', 'HKO'), ('YYZ', 'SFO'), ('YUL', 'YYZ'), ('HKO', 'ORD')]
    // ['YUL', 'YYZ', 'SFO', 'HKO', 'ORD'].
    static HashMap<String, PriorityQueue<String>> map = new HashMap<String, PriorityQueue<String>>();
    static LinkedList<String> result = new LinkedList<String>();
  static  String[][] tickets=


            {    {"SFO", "HKO"},
                    {"YYZ","SFO"}   ,         {"YUL","YYZ"},
                    {"HKO","ORD"}};

    public static List<String> findItinerary(String[][] tickets) {

        for (String[] ticket : tickets) {
            if (!map.containsKey(ticket[0])) {
                PriorityQueue<String> q = new PriorityQueue<String>();
                map.put(ticket[0], q);
            }
            map.get(ticket[0]).offer(ticket[1]);
        }

        dfs("JFK");
        return result;
    }

    public static void dfs(String s) {
        PriorityQueue<String> q = map.get(s);

        while (q != null && !q.isEmpty()) {
            dfs(q.poll());
        }

        result.addFirst(s);
    }






        public static void main(String[] args) {

            System.out.println( findItinerary(tickets));

    }


}
