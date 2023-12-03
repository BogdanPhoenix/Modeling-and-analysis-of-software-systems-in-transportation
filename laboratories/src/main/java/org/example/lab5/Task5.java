package org.example.lab5;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Task5 {
    private static final String DEFAULT_VALUE = "null";
    private static final String EMPTY_LINE = "[" + DEFAULT_VALUE + "]";

    public String serialize(TreeNode root){
        if (root == null) {
            return EMPTY_LINE;
        }

        return root.toString();
    }

    public TreeNode deserialize(@NotNull String data) {
        if(data.isEmpty() || data.equals(EMPTY_LINE)){
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        var components = getComponents(data);

        var iterator = components.iterator();
        TreeNode root = new TreeNode(Integer.parseInt(iterator.next()));
        queue.add(root);

        while (iterator.hasNext()){
            TreeNode parent = queue.poll();
            var component = iterator.next();

            if(!component.equals(DEFAULT_VALUE)){
                var left = new TreeNode(Integer.parseInt(component));
                Objects.requireNonNull(parent).left = left;
                queue.offer(left);
            }

            if(!iterator.hasNext()){
                break;
            }

            component = iterator.next();

            if(!component.equals(DEFAULT_VALUE)){
                var right = new TreeNode(Integer.parseInt(component));
                Objects.requireNonNull(parent).right = right;
                queue.offer(right);
            }
        }

        return root;
    }

    private static List<String> getComponents (String data){
        data = data.substring(1, data.length()-1);

        var components = data.split(", ");

        return Arrays.stream(components).toList();
    }
}
