package org.example.lab4.queue;

import java.util.*;

public class Task7 {
    private Task7() {
        throw new IllegalStateException("Utility class");
    }

    private static Deque<Integer> deque;
    public static int limitedAmountSubsequence(Integer[] nums, int k) {
        if(k == 1){
            return nums[0];
        }

        deque = new ArrayDeque<>();
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            deleteElement(nums, i);
            deque.offerLast(i);
        }
        res.add(nums[deque.peekFirst()]);

        for (int i = k; i < nums.length; i++) {
            if (deque.peekFirst() == i - k) {
                deque.pollFirst();
            }

            deleteElement(nums, i);

            deque.offerLast(i);
            res.add(nums[deque.peekFirst()]);
        }

        return res.stream().mapToInt(i->i).sum();
    }

    private static void deleteElement(Integer[] nums, int index){
        while (!deque.isEmpty() && nums[index] >= nums[deque.peekLast()]) {
            deque.pollLast();
        }
    }
}
