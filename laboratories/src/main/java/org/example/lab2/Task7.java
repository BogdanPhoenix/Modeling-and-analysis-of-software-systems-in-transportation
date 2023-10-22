package org.example.lab2;

public class Task7 {
    private Task7() {
        throw new IllegalStateException("Task7");
    }

    public static boolean checkNDuplicate(int[] nums){
        for(int i = 0; i < nums.length - 1; ++i){
            for(int j = i + 1; j < nums.length; ++j){
                if(nums[i] == 2 * nums[j]){
                    return true;
                }
            }
        }

        return false;
    }
}
