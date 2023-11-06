package org.example.lab4.queue;

public class Task1 {
    private Task1() {
        throw new IllegalStateException("Utility class");
    }

    public static int firstUniqueCharacter(String line){
        int[] letters = new int[26];
        char[] chars = line.toCharArray();
        char charStart = 'a';

        for(char c : chars){
            ++letters[c - charStart];
        }

        for(int i = 0; i < chars.length; ++i){
            if(letters[chars[i] - charStart] == 1){
                return i;
            }
        }

        return -1;
    }
}
