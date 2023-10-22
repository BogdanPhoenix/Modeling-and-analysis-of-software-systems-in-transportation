package org.example.lab2;

public class Task2 {
    private Task2() {
        throw new IllegalStateException("Task2");
    }

    public static int containEvenNumberOfDigits(int[] nums){
        int count = 0;

        for(var el : nums){
            if(hasEvenDigitCount(el)){
                ++count;
            }
        }

        return count;
    }

    private static boolean hasEvenDigitCount(int num) {
        int digitCount = split(num);

        return digitCount % 2 == 0;
    }

    private static int split(int num){
        int count = 0;

        while (num > 0){
            ++count;
            num /= 10;
        }

        return count;
    }
}
