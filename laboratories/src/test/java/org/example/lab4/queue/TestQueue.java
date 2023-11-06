package org.example.lab4.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TestQueue {
    private Queue<Integer> queue;

    @BeforeEach
    void createStack(){
        queue = new Queue<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        queue.offer(7);
        queue.offer(8);
        queue.offer(9);
        queue.offer(10);
    }

    @Test
    void testPushAndPop(){
        Integer expectedStackSize = 0;
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(Integer i : expected){
            assertEquals(i, queue.poll());
        }

        assertEquals(expectedStackSize, queue.size());
    }

    @Test
    void testPop_Wrong(){
        Queue<Integer> queue = new Queue<>();
        assertThrows(NoSuchElementException.class, queue::poll);
    }

    @Test
    void testPeek_Correct(){
        Integer expected = 1;
        Integer stackSize = 10;
        Integer actual = queue.peek();

        assertEquals(expected, actual);
        assertEquals(stackSize, queue.size());
    }

    @Test
    void testPeek_Wrong(){
        Queue<Integer> queue = new Queue<>();
        assertThrows(NoSuchElementException.class, queue::peek);
    }
}
