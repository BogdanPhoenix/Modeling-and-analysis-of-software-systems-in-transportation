package org.example.lab1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Task2 {
    public Node swap(Node node){
        if(node == null){
            return null;
        }
        else if(node.nextNode == null){
            return node;
        }

        Node buffer = node.nextNode;
        node.nextNode = swap(buffer.nextNode);
        buffer.nextNode = node;

        return buffer;
    }

    static class Node implements Iterable<Integer>{
        private final int value;
        private Node nextNode;

        public Node(int value, Node next){
            this.nextNode = next;
            this.value = value;
        }

        public Node(int value){
            this(value, null);
        }

        @Override
        public Iterator<Integer> iterator() {
            return new Itr(this);
        }

        private static class Itr implements Iterator<Integer>{
            private Node currentNode;

            public Itr(Node startNode){
                currentNode = startNode;
            }

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public Integer next() {
                if(!hasNext()){
                    throw new NoSuchElementException();
                }

                Node current = currentNode;
                currentNode = currentNode.nextNode;
                return current.value;
            }
        }
    }
}