package org.example.lab5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    private static final String DEFAULT_VALUE = "null";

    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString(){
        Queue<TreeNode> queue = new LinkedList<>();
        List<String> buffer = new ArrayList<>();
        queue.add(this);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                buffer.add(DEFAULT_VALUE);
                continue;
            }
            buffer.add(String.valueOf(node.val));
            queue.add(node.left);
            queue.add(node.right);
        }

        reductions(buffer);

        return buffer.toString();
    }

    private void reductions(List<String> buffer){
        for(int i = buffer.size() - 1; i >= 0; i--){
            if(!buffer.get(i).equals(DEFAULT_VALUE)){
                break;
            }
            buffer.remove(i);
        }
    }
}
