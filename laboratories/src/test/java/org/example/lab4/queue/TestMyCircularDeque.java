package org.example.lab4.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestMyCircularDeque {
    @Test
    void testInsertFront(){
        Integer[] expected = {1,2,3,4,5,6,7,8,9,10};
        MyCircularDeque<Integer> deque = new MyCircularDeque<>(expected.length);

        for(var element : expected){
            deque.insertFront(element);
        }

        assertEquals(expected.length, deque.size());
    }

    @Test
    void testGetAndDeleteFront(){
        Integer[] expected = {1,2,3,4,5,6,7,8,9,10};
        MyCircularDeque<Integer> deque = new MyCircularDeque<>(expected.length);

        for(int i = expected.length - 1; i >= 0; --i){
            deque.insertFront(expected[i]);
        }

        assertEquals(expected.length, deque.size());

        for(var element : expected){
            assertEquals(element, deque.getFront());
            deque.deleteFront();
        }

        assertEquals(0, deque.size());
    }

    @Test
    void testInsertLast(){
        Integer[] expected = {1,2,3,4,5,6,7,8,9,10};
        MyCircularDeque<Integer> deque = new MyCircularDeque<>(expected.length);

        for(var element : expected){
            deque.insertLast(element);
        }

        assertEquals(expected.length, deque.size());
    }

    @Test
    void testGetAndDeleteLast(){
        Integer[] expected = {1,2,3,4,5,6,7,8,9,10};
        MyCircularDeque<Integer> deque = new MyCircularDeque<>(expected.length);

        for(var element : expected){
            deque.insertLast(element);
        }

        assertEquals(expected.length, deque.size());

        for(int i = expected.length - 1; i >= 0; --i){
            assertEquals(expected[i], deque.getRear());
            deque.deleteLast();
        }

        assertEquals(0, deque.size());
    }

    @Test
    void testIsEmpty(){
        Integer[] expected = {1,2,3,4,5,6,7,8,9,10};
        MyCircularDeque<Integer> deque = new MyCircularDeque<>(expected.length);

        for(var element : expected){
            deque.insertLast(element);
        }

        assertFalse(deque.isEmpty());
    }

    @Test
    void testIsFull(){
        Integer[] expected = {1,2,3,4,5,6,7,8,9,10};
        MyCircularDeque<Integer> deque = new MyCircularDeque<>(expected.length);

        for(var element : expected){
            deque.insertLast(element);
        }

        assertTrue(deque.isFull());
    }
}
