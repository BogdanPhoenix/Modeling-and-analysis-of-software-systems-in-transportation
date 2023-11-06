package org.example.lab4.queue;

import java.util.*;
import java.util.stream.IntStream;

public class Task6 {
    private Task6() {
        throw new IllegalStateException("Utility class");
    }

    public static Integer[] maxSlidingWindow(Integer[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new Integer[0];
        }

        List<Integer> maxElementsList = IntStream.range(0, nums.length - k + 1)
                .mapToObj(i -> Arrays.copyOfRange(nums, i, i + k))
                .map(subArray -> Arrays.stream(subArray).max(Integer::compareTo).orElse(Integer.MIN_VALUE))
                .toList();


        return maxElementsList.toArray(Integer[]::new);
    }
}
