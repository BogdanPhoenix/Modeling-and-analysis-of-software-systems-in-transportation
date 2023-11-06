package org.example.lab4.stack;

public class MinStack extends Stack<Integer>{
    public MinStack(Integer... elements) {
        super(elements);
    }

    public int getMin(){
        int min = head.value;
        Node<Integer> current = head;

        while (current != null){
            min = Math.min(min, current.value);
            current = current.next;
        }

        return min;
    }
}
