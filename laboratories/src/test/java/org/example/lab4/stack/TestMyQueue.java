package org.example.lab4.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TestMyQueue {
    private MyQueue<Integer> queue;

    @BeforeEach
    void createStack(){
        queue = new MyQueue<>();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(6);
        queue.push(7);
        queue.push(8);
        queue.push(9);
        queue.push(10);
    }

    @Test
    void testPushAndPop(){
        Integer expectedStackSize = 0;
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(Integer i : expected){
            assertEquals(i, queue.pop());
        }

        assertEquals(expectedStackSize, queue.size());
    }

    @Test
    void testPop_Wrong(){
        MyQueue<Integer> queue = new MyQueue<>();
        assertThrows(NoSuchElementException.class, queue::pop);
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
        MyQueue<Integer> queue = new MyQueue<>();
        assertThrows(NoSuchElementException.class, queue::peek);
    }
}
