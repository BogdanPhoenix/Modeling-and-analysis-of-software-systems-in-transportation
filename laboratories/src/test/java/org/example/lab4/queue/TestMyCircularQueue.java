package org.example.lab4.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestMyCircularQueue {
    @Test
    void testEnQueue(){
        Integer[] expected = {1,2,3,4,5,6,7,8,9,10};
        MyCircularQueue<Integer> queue = new MyCircularQueue<>(expected.length);

        for(var element : expected){
            queue.enQueue(element);
        }

        assertEquals(expected.length, queue.size());
    }

    @Test
    void testFrontAndDeQueue(){
        Integer[] expected = {1,2,3,4,5,6,7,8,9,10};
        MyCircularQueue<Integer> queue = new MyCircularQueue<>(expected.length);

        for(var element : expected){
            queue.enQueue(element);
        }

        assertEquals(expected.length, queue.size());

        for(var element : expected){
            assertEquals(element, queue.Front());
            queue.deQueue();
        }

        assertEquals(0, queue.size());
    }

    @Test
    void testIsEmpty(){
        Integer[] expected = {1,2,3,4,5,6,7,8,9,10};
        MyCircularQueue<Integer> queue = new MyCircularQueue<>(expected.length);

        for(var element : expected){
            queue.enQueue(element);
        }

        assertFalse(queue.isEmpty());
    }

    @Test
    void testIsFull(){
        Integer[] expected = {1,2,3,4,5,6,7,8,9,10};
        MyCircularQueue<Integer> queue = new MyCircularQueue<>(expected.length);

        for(var element : expected){
            queue.enQueue(element);
        }

        assertTrue(queue.isFull());
    }
}
