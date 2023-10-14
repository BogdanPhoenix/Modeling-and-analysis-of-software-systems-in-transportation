package org.example.lab1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TestTask3 {
    @ParameterizedTest
    @DisplayName("Checking the Fibonacci number by index.")
    @CsvSource(value = {"Number, Index", "1, 2", "2, 3", "3, 4"}, useHeadersInDisplayName = true)
    void testReversString(int expected, int actual){
        assertEquals(expected, Task3.numFibonacci(actual));
    }
}
