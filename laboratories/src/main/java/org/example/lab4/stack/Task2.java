package org.example.lab4.stack;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    private Task2() {
        throw new IllegalStateException("Utility class");
    }

    public static List<Integer> inorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> buffer = new Stack<>();
        TreeNode current = root;

        while (current != null || !buffer.isEmpty()){
            while (current != null){
                buffer.push(current);
                current = current.left;
            }
            current = buffer.pop();
            result.add(current.val);
            current = current.right;
        }

        return result;
    }
}
