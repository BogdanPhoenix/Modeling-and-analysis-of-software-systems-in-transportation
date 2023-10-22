package org.example.lab2;

public class Task8 {
    private Task8() {
        throw new IllegalStateException("Task8");
    }

    public static boolean checkMountainRange(int[] nums){
        int n = nums.length;

        if (n < 3) {
            return false;
        }

        int peak = 0;
        while (peak + 1 < n && nums[peak] < nums[peak + 1]) {
            peak++;
        }

        if (peak == 0 || peak == n - 1) {
            return false;
        }

        while (peak + 1 < n && nums[peak] > nums[peak + 1]) {
            peak++;
        }

        return peak == n - 1;
    }
}
