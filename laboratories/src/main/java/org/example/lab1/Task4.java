package org.example.lab1;

public class Task4 {
    private static final int MAX_STEP = 2;
    private Task4() {
        throw new IllegalStateException("Task4");
    }

    public static int climb(int step){
        if(step == MAX_STEP){
            return step;
        }
        return combinator(step - 1, MAX_STEP - 1) + combinator(step - 1, MAX_STEP);
    }

    private static int combinator(int n, int k){
        if(k < 0 || k > n){
            return 0;
        }
        return fact(n) / (fact(k) * fact(n - k));
    }

    private static int fact(int n){
        if(n <= 1){
            return 1;
        }
        return n * fact(n - 1);
    }
}
