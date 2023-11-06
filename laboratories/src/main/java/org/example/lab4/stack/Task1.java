package org.example.lab4.stack;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    private static final Map<Character, Character> BRACKETS;

    static {
        BRACKETS = new HashMap<>();
        BRACKETS.put(')', '(');
        BRACKETS.put(']', '[');
        BRACKETS.put('}', '{');
    }

    private Task1() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean validBrackets(String line){
        Stack<Character> opens = new Stack<>();
        char[] chars = line.toCharArray();

        for(var ch : chars){
            if (isOpen(ch)) {
                opens.push(ch);
            } else if (!checkClose(opens, ch)) {
                return false;
            }
        }

        return opens.isEmpty();
    }

    private static boolean isOpen(char bracket) {
        return bracket == '(' || bracket == '[' || bracket == '{';
    }

    private static boolean checkClose(Stack<Character> opens, char close) {
        return !opens.isEmpty() && Task1.BRACKETS.get(close) == opens.pop();
    }
}
