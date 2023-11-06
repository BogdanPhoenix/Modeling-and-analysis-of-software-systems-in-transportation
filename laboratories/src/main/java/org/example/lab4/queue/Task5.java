package org.example.lab4.queue;

import java.util.*;
import java.util.Queue;

public class Task5 {
    private Task5() {
        throw new IllegalStateException("Utility class");
    }

    public static Integer[] movesToStamp(String stamp, String target) {
        int stampLength = stamp.length();
        int targetLength = target.length();
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] done = new boolean[targetLength];
        Deque<Integer> ans = new ArrayDeque<>();
        List<Node> A = new ArrayList<>();

        for (int i = 0; i <= targetLength-stampLength; ++i) {
            Set<Integer> made = new HashSet<>();
            Set<Integer> todo = new HashSet<>();

            for (int j = 0; j < stampLength; ++j) {
                if (target.charAt(i+j) == stamp.charAt(j)) {
                    made.add(i + j);
                }
                else {
                    todo.add(i + j);
                }
            }

            A.add(new Node(made, todo));
            if (todo.isEmpty()) {
                ans.push(i);
                for (int j = i; j < i + stampLength; ++j) if (!done[j]) {
                    queue.add(j);
                    done[j] = true;
                }
            }
        }

        while (!queue.isEmpty()) {
            int i = queue.poll();
            for (int j = Math.max(0, i-stampLength+1); j <= Math.min(targetLength-stampLength, i); ++j) {
                if (A.get(j).todo.contains(i)) {
                    A.get(j).todo.remove(i);
                    if (A.get(j).todo.isEmpty()) {
                        ans.push(j);
                        for (int m: A.get(j).made) if (!done[m]) {
                            queue.add(m);
                            done[m] = true;
                        }
                    }
                }
            }
        }

        for (boolean b: done) {
            if (!b) {
                return new Integer[0];
            }
        }

        return ans.toArray(Integer[]::new);
    }

    private static class Node {
        Set<Integer> made;
        Set<Integer> todo;
        Node(Set<Integer> m, Set<Integer> t) {
            made = m;
            todo = t;
        }
    }
}