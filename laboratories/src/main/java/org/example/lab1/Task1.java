package org.example.lab1;

public class Task1 {
    private Task1() {
        throw new IllegalStateException("Task1");
    }

    public static String reversString(String text){
        if(text == null || text.isEmpty()){
            return "";
        }

        return reversString(text, text.length() - 1);
    }

    private static String reversString(String text, int index){
        if(index < 0){
            return "";
        }
        return text.charAt(index) + reversString(text, index - 1);
    }
}
