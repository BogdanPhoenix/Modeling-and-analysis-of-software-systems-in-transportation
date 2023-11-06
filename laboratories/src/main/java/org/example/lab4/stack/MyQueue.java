package org.example.lab4.stack;

public class MyQueue<E> {
    private final Stack<E> stack;
    private final Stack<E> bufferStack;

    public MyQueue() {
        stack = new Stack<>();
        bufferStack = new Stack<>();
    }

    public void push(E x) {
        stack.push(x);
    }

    public E pop() {
        overflowStacks(stack, bufferStack);

        E popped = bufferStack.pop();

        overflowStacks(bufferStack, stack);

        return popped;
    }

    public E peek() {
        overflowStacks(stack, bufferStack);

        E peeked = bufferStack.top();

        overflowStacks(bufferStack, stack);

        return peeked;
    }

    private void overflowStacks(Stack<E> output, Stack<E> input) {
        while(!output.isEmpty()) {
            input.push(output.pop());
        }
    }

    public int size() {
        return stack.size();
    }

    public boolean empty() {
        return stack.isEmpty() && bufferStack.isEmpty();
    }
}
