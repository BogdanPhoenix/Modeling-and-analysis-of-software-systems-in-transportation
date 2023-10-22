package org.example.lab2;

public class Task5 {
    private Task5() {
        throw new IllegalStateException("Task5");
    }

    public static void union(int[] nums1, int[] nums2){
        for(int i = nums2.length - 1; i >= 0; --i){
            nums1[nums1.length - 1 - i] = nums2[i];
        }
        sort(nums1);
    }

    private static void sort(int[] nums){
        Sort.quickSort(nums, 0, nums.length - 1);
    }
}
