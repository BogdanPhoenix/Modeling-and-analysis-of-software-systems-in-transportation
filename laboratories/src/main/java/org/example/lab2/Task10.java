package org.example.lab2;

public class Task10 {
    private Task10() {
        throw new IllegalStateException("Task10");
    }

    public static void sortParity(int[] arr){
        if(arr.length <= 1){
            return;
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }

            while (left < right && arr[right] % 2 == 1) {
                right--;
            }

            swap(arr, left, right);

            left++;
            right--;
        }
    }

    private static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
