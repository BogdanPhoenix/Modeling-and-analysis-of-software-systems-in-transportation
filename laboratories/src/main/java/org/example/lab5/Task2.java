package org.example.lab5;

import org.jetbrains.annotations.NotNull;

public class Task2 {
    private Task2(){}

    public static boolean isSymmetric(@NotNull TreeNode root) {
        return treeTraversal(root.left, root.right);
    }

    private static boolean treeTraversal(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        else if (left == null || right == null){
            return false;
        }
        return treeTraversal(left.left, right.right) && treeTraversal(left.right, right.left);
    }
}
