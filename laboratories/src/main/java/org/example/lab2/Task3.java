package org.example.lab2;

public class Task3 {
    private Task3() {
        throw new IllegalStateException("Task3");
    }
    public static void sortAndReturnArraySquaresEachNum(int[] nums){
        for(int i = 0; i < nums.length; ++i){
            nums[i] *= nums[i];
        }

        sort(nums);
    }

    private static void sort(int[] nums){
        Sort.quickSort(nums, 0, nums.length - 1);
    }


}
