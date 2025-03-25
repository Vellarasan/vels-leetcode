package io.vels.easy.validparentheses020;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public static void main(String[] args) {
        String s = "{[]}";
        System.out.println(validParentheses(s));
    }

    private static boolean validParentheses(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }

        // Create an empty stack to keep track of opening brackets
        Deque<Character> stack = new ArrayDeque<>();

        // Loop through every character in the string
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.getFirst();
                if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
