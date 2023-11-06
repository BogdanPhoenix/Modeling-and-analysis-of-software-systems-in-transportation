package org.example.lab4.stack;

public class Task5 {
    private static final Character OPEN_BRACKET = '[';
    private static final Character CLOSE_BRACKET = ']';

    private Task5() {
        throw new IllegalStateException("Utility class");
    }

    public static String decodeString(String line) {
        int num=0;
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strBuild = new Stack<>();
        StringBuilder str = new StringBuilder();

        for(char c : line.toCharArray()){
            if(Character.isDigit(c)){
                num = num * 10 + c - '0';
            }
            else if(c==OPEN_BRACKET){
                strBuild.push(str);
                str = new StringBuilder();
                numStack.push(num);
                num = 0;
            }else if(c==CLOSE_BRACKET){
                String temp = str.toString();
                str = strBuild.pop();
                int count = numStack.pop();
                str.append(temp.repeat(count));
            }else{
                str.append(c);
            }
        }
        return str.toString();
    }
}
