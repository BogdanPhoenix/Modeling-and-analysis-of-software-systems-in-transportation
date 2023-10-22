package org.example.lab2;

public class Task9 {
    private Task9() {
        throw new IllegalStateException("Task9");
    }

    public static void replacesElements(int[] arr){
        int n = arr.length;

        if(n == 0){
            return;
        }

        int maxRight = arr[n - 1];
        arr[n - 1] = -1;

        for (int i = n - 2; i >= 0; i--) {
            int current = arr[i];
            arr[i] = maxRight;
            maxRight = Math.max(maxRight, current);
        }
    }
}
