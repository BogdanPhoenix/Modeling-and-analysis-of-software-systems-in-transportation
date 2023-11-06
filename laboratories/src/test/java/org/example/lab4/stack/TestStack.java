package org.example.lab4.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class TestStack {

    private Stack<Integer> stack;

    @BeforeEach
    void createStack(){
        stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
    }

    @Test
    void testPushAndPop(){
        Integer expectedStackSize = 0;
        Integer[] expected = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        for(Integer i : expected){
            assertEquals(i, stack.pop());
        }

        assertEquals(expectedStackSize, stack.size());
    }

    @Test
    void testPop_Wrong(){
        Stack<Integer> stack = new Stack<>();
        assertThrows(NoSuchElementException.class, stack::pop);
    }

    @Test
    void testTop_Correct(){
        Integer expected = 10;
        Integer stackSize = 10;
        Integer actual = stack.top();

        assertEquals(expected, actual);
        assertEquals(stackSize, stack.size());
    }

    @Test
    void testTop_Wrong(){
        Stack<Integer> stack = new Stack<>();
        assertThrows(NoSuchElementException.class, stack::top);
    }
}
