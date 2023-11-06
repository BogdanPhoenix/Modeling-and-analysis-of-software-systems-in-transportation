package org.example.lab4.stack;

public class Task7 {
    private static final Character OPEN_BRACKET = '(';

    private Task7() {
        throw new IllegalStateException("Utility class");
    }

    public static int longestValidParentheses(String line) {
        if(line.isEmpty()){
            return 0;
        }

        int max = 0;
        Stack<Integer> brackets = new Stack<>();
        brackets.push(-1);

        for(int i = 0; i < line.length(); ++i){
            if(line.charAt(i) == OPEN_BRACKET){
                brackets.push(i);
            }
            else{
                brackets.pop();
                if(brackets.isEmpty()){
                    brackets.push(i);
                }
                else{
                    max = Math.max(max, i - brackets.top());
                }
            }
        }

        return max;
    }
}
