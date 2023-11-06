package org.example.lab4.queue;

import java.util.LinkedList;

public class MyCircularDeque<E> {
    private final int maxSize;
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public MyCircularDeque(int k) {
        maxSize = k;
        head = null;
        tail = null;
        size = 0;
    }

    public boolean insertFront(E value) {
        if(!checkInsert()){
            return false;
        }

        Node<E> first = head;
        Node<E> newNode = new Node<>(null, value, first);
        head = newNode;

        if (first == null) {
            tail = newNode;
        }
        else {
            first.prev = newNode;
        }
        ++size;

        return true;
    }

    public boolean insertLast(E value) {
        if(!checkInsert()){
            return false;
        }

        Node<E> l = tail;
        Node<E> newNode = new Node<>(l, value, null);
        tail = newNode;
        if (l == null)
            head = newNode;
        else
            l.next = newNode;
        size++;

        return true;
    }

    public boolean deleteFront() {
        Node<E> first = head;

        if (first == null){
            return false;
        }

        Node<E> next = first.next;

        first.val = null;
        first.next = null;

        head = next;
        if (next == null) {
            tail = null;
        }
        else {
            next.prev = null;
        }
        --size;

        return true;
    }

    public boolean deleteLast() {
        Node<E> last = tail;

        if(last == null){
            return false;
        }

        Node<E> prev = last.prev;

        last.val = null;
        last.prev = null;

        tail = prev;

        if (prev == null) {
            head = null;
        }
        else {
            prev.next = null;
        }
        --size;

        return true;
    }

    private boolean checkInsert(){
        return size() <= maxSize;
    }

    public E getFront() {
        return isEmpty() ? null : head.val;
    }

    public E getRear() {
        return isEmpty() ? null : tail.val;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public int size() {
        return size;
    }

    private static class Node<E> {
        E val;
        Node<E> prev;
        Node<E> next;

        Node(E val){
            this(null, val, null);
        }

        Node(Node<E> prev, E val, Node<E> next){
            this.prev = prev;
            this.val = val;
            this.next = next;
        }
    }
}
