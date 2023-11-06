package org.example.lab4.queue;

public class MyCircularQueue<E> {
    private final int maxSize;
    private int size;
    private Node<E> head;
    private Node<E> last;

    public MyCircularQueue(int k) {
        maxSize = k;
        size = 0;
        head = null;
        last = null;
    }

    public boolean enQueue(E value) {
        if(isFull()){
            return false;
        }

        Node<E> newNode = new Node<>(value);
        if(isEmpty()){
            last = newNode;
            head = newNode;
        }
        else {
            last.next = newNode;
            last = last.next;
        }
        last.next = head;

        ++size;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }

        head = head.next;
        last.next = head;

        --size;
        return true;
    }

    public E Front() {
        return isEmpty() ? null : head.val;
    }

    public E Rear() {
        return isEmpty() ? null : last.val;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size >= maxSize;
    }

    public int size() {
        return size;
    }

    private static class Node<E> {
        E val;
        Node<E> next;

        Node(E val){
            this(val, null);
        }

        Node(E val, Node<E> next){
            this.val = val;
            this.next = next;
        }
    }
}

