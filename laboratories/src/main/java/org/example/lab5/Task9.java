package org.example.lab5;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class Task9 {
    private static final Character SEPARATOR = '-';
    private Task9(){}

    public static TreeNode recoverFromPreorder(String traversal) {
        if(traversal == null || traversal.isEmpty()){
            return null;
        }
        Queue<Character> chars = traversal.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toCollection(LinkedList::new));

        Deque<TreeNode> deque = new LinkedList<>();

        while (!chars.isEmpty()) {
            int level = getLevel(chars);
            int value = getValue(chars);

            TreeNode node = new TreeNode(value);

            while (level < deque.size()){
                deque.pop();
            }

            if(!deque.isEmpty()){
                var obj = deque.peek();

                if(obj.left == null){
                    obj.left = node;
                }
                else {
                    obj.right = node;
                }
            }

            deque.push(node);
        }

        return deque.peekLast();
    }

    private static int getValue(Queue<Character> chars){
        StringBuilder value = new StringBuilder();

        while(!chars.isEmpty()){
            if(chars.peek().equals(SEPARATOR)){
                break;
            }

            value.append(chars.poll());
        }

        return Integer.parseInt(value.toString());
    }

    private static int getLevel(Queue<Character> chars){
        int count = 0;

        while (!chars.isEmpty()){
            if(!chars.peek().equals(SEPARATOR)){
                break;
            }
            ++count;
            chars.poll();
        }

        return count;
    }
}
