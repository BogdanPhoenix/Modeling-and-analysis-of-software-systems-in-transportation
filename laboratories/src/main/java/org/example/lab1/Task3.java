package org.example.lab1;

public class Task3 {
    private Task3() {
        throw new IllegalStateException("Task3");
    }

    public static int numFibonacci(int n){
        if(n <= 0){
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return calculateNumFibonacci(0, 1, n);
    }

    private static int calculateNumFibonacci(int first, int second, int n){
        if (n == 1){
            return second;
        }

        return calculateNumFibonacci(second, first + second, n - 1);
    }
}
