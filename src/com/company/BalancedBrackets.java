package com.company;

import java.util.Collections;
import java.util.Stack;

public class BalancedBrackets {
    /*
    A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].

Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {) occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type. There are three types of matched pairs of brackets: [], {}, and ().

A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, {[(])} is not balanced because the contents in between { and } are not balanced. The pair of square brackets encloses a single, unbalanced opening bracket, (, and the pair of parentheses encloses a single, unbalanced closing square bracket, ].

By this logic, we say a sequence of brackets is balanced if the following conditions are met:

    It contains no unmatched brackets.
    The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.

Given
strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, return YES. Otherwise, return NO.
     */

    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '{':
                case '[':
                case '(':
                    if (i == s.length() - 1) {
                        return "NO";
                    }
                    stack.push(s.charAt(i));
                    break;
                case '}':
                    if (stack.isEmpty()) {
                        System.out.println("NO");
                        return "NO";
                    }
                    if (stack.pop() != '{') {
                        System.out.println("NO");
                        return "NO";
                    }
                    break;
                case ']':
                    if (stack.isEmpty()) {
                        System.out.println("NO");
                        return "NO";
                    }
                    if (stack.pop() != '[') {
                        System.out.println("NO");
                        return "NO";
                    }
                    break;
                case ')':
                    if (stack.isEmpty()) {
                        System.out.println("NO");
                        return "NO";
                    }
                    if (stack.pop() != '(') {
                        System.out.println("NO");
                        return "NO";
                    }
                    break;
                default:
                    return "INVALID_INPUT";
            }
        }

        System.out.println("YES");
        return "YES";
    }
}
