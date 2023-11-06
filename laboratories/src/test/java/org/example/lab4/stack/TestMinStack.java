package org.example.lab4.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestMinStack {
    @Test
    void testMinStack(){
        MinStack minStack = new MinStack(5,-6,9,10,51,52,63,-4,-4,5);
        int expected = -6;
        int actual = minStack.getMin();

        Assertions.assertEquals(expected, actual);
    }
}
