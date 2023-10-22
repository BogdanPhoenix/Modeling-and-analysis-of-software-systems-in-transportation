package org.example.lab2;

public class Task4 {
    private Task4() {
        throw new IllegalStateException("Task4");
    }

    public static void duplicateEachOccurrenceZero(int[] nums){
        int i = 0;
        while (i < nums.length - 1){
            if(nums[i] == 0){
                shift(nums, ++i);
                nums[i] = 0;
            }
            ++i;
        }
    }

    private static void shift(int[] nums, int indexStart){
        for(int i = nums.length - 1; i > indexStart; --i){
            nums[i] = nums[i - 1];
        }
    }
}
