package org.example.lab2;

public class Task7 {
    private Task7() {
        throw new IllegalStateException("Task7");
    }

    public static boolean checkNDuplicate(int[] nums){
        for(int i = 0; i < nums.length; ++i){
            for(int j = 0; j < nums.length; ++j){
                if(i == j){
                    continue;
                }
                else if(nums[i] == 2 * nums[j]){
                    return true;
                }
            }
        }

        return false;
    }
}
