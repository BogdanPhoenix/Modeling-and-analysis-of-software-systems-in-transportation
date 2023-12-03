package org.example.lab5;

import java.util.*;

public class Task8 {
    private Task8(){}

    public static List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Map<Integer, List<Integer>> columnTable = new HashMap<>();
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.offer(new Pair<>(root, 0));

        while (!queue.isEmpty()) {
            Pair<TreeNode, Integer> p = queue.poll();
            TreeNode node = p.getKey();
            int column = p.getValue();

            if (node != null) {
                columnTable.computeIfAbsent(column, k -> new ArrayList<>());
                columnTable.get(column).add(node.val);

                queue.offer(new Pair<>(node.left, column - 1));
                queue.offer(new Pair<>(node.right, column + 1));
            }
        }

        List<Integer> sortedKeys = new ArrayList<>(columnTable.keySet());
        Collections.sort(sortedKeys);
        for (int key : sortedKeys) {
            var collection = columnTable.get(key);
            collection.sort(Comparator.naturalOrder());
            result.add(collection);
        }

        return result;
    }

    private static class Pair<K, V>{
        K key;
        V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}
