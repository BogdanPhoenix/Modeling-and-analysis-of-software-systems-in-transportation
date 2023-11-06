package org.example.lab4.queue;

import java.util.NoSuchElementException;

public class Queue<E> {
    private int size = 0;
    private Node<E> head;
    private Node<E> last;

    public void offer(E x) {
        Node<E> newNode = new Node<>(x);
        if(empty()){
            last = newNode;
            head = newNode;
        }
        else {
            last.next = newNode;
            last = last.next;
        }
        ++size;
    }

    public E poll() {
        if(head == null){
            throw new NoSuchElementException();
        }

        E val = head.val;

        if(head == last){
            last = null;
        }

        head = head.next;
        --size;
        return val;
    }

    public E peek() {
        if(head == null){
            throw new NoSuchElementException();
        }

        return head.val;
    }

    public boolean empty() {
        return head == null && last == null;
    }

    public int size(){
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
