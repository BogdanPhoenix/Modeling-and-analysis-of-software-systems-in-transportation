package org.example.lab5;

import java.util.Deque;
import java.util.LinkedList;

public class Task3 {
    private Task3(){}

    public static TreeNode invertTree(TreeNode root) {
        Deque<TreeNode> nodes = new LinkedList<>();
        TreeNode current = root;
        TreeNode buffer;

        while (current != null){
            if(current.left != null){
                nodes.push(current.left);
            }
            if(current.right != null){
                nodes.push(current.right);
            }

            buffer = current.left;
            current.left = current.right;
            current.right = buffer;

            if(nodes.isEmpty()){
                break;
            }

            current = nodes.pop();
        }

        return root;
    }
}
