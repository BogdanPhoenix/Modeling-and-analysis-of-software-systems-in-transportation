package org.example.lab4.stack;

import java.util.NoSuchElementException;

public class Stack<E> {
    protected int size;
    protected Node<E> head;

    public Stack(){
        size = 0;
        head = null;
    }

    @SafeVarargs
    public Stack(E... elements){
        for (E element : elements){
            push(element);
        }
    }

    public E push(E element){
        head = new Node<>(element, head);

        size++;

        return head.value;
    }

    public E pop(){
        Node<E> first = head;

        if (first == null){
            throw new NoSuchElementException();
        }

        E element = head.value;
        head = head.next;

        size--;
        return element;
    }

    public E top(){
        Node<E> first = head;

        if (first == null) {
            throw new NoSuchElementException();
        }

        return first.value;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    protected static class Node<E> {
        E value;
        Node<E> next;

        Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }
}
