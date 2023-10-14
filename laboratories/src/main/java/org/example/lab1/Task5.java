package org.example.lab1;

public class Task5 {
    private Task5() {
        throw new IllegalStateException("Task5");
    }

    public static double pow(double x, int n){
        double result =
                n < 0
                ? 1.0 / calculatePow(x, -n)
                : calculatePow(x, n);

        return (double) Math.round(result * 10000) / 10000;
    }

    private static double calculatePow(double x, int n){
        if(n == 0){
            return 1;
        }
        return x * calculatePow(x, n - 1);
    }
}
