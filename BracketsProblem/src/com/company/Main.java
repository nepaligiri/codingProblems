package com.company;

import java.util.HashMap;
import java.util.Stack;

public class Main {
    private HashMap<Character, Character> mappings;

    public   static boolean isValid(String s) {
        HashMap<Character, Character> mappings =new HashMap<Character, Character>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mappings.containsKey(c)) {
                char topElement = stack.empty() ? '#' : stack.pop();

                if (topElement != mappings.get(c)) {
                    return false;

                } else {
                    stack.push(c);
                }

            }

        }

        return stack.isEmpty();
    }
        public   static void main (String[]args){
            System.out.println(isValid("{}]()()"));
        }
    }
