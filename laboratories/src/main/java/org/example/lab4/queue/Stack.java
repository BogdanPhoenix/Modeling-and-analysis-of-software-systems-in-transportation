package org.example.lab4.queue;

public class Stack<E> {
    private final Queue<E> queue;

    public Stack() {
        queue = new Queue<>();
    }

    public void push(E x) {
        int size = queue.size();

        queue.offer(x);

        for(int i = 0; i < size; ++i){
            E buffer = queue.poll();
            queue.offer(buffer);
        }
    }

    public E pop() {
        return queue.poll();
    }

    public E top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.empty();
    }

    public int size() {
        return queue.size();
    }
}
