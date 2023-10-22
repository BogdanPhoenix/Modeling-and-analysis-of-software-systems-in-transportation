package org.example.lab2;

public class Task1 {
    private static final int SEARCH_ELEMENT = 1;
    private Task1() {
        throw new IllegalStateException("Task1");
    }

    public static int maxNumRepetitionsFirst(int[] bits){
        int count = 0;
        int maxCount = 0;

        for(var bit : bits){
            if(bit == SEARCH_ELEMENT){
                ++count;
                maxCount = Math.max(maxCount, count);
            }
            else{
                count = 0;
            }
        }

        return maxCount;
    }
}
