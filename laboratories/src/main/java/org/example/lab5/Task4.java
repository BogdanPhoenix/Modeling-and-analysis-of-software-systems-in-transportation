package org.example.lab5;

import java.util.ArrayDeque;
import java.util.Deque;

public class Task4 {
    private Task4(){}

    public static int kthSmallest(TreeNode root, int k) {
        int counter = 0;

        Deque<TreeNode> deque = new ArrayDeque<>();
        TreeNode current = root;

        while (current != null || !deque.isEmpty()) {
            while (current != null) {
                deque.push(current);
                current = current.left;
            }

            current = deque.pop();
            ++counter;

            if(counter == k){
                return current.val;
            }

            current = current.right;
        }

        return -1;
    }
}
