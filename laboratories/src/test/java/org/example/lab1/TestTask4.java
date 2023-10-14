package org.example.lab1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TestTask4 {
    @ParameterizedTest
    @DisplayName("Checking possible combinations to reach the top.")
    @CsvSource(value = {"Combinations, Steps", "2, 2", "3, 3", "6, 4", "15, 6", "45, 10", "66, 12"}, useHeadersInDisplayName = true)
    void testReversString(int expected, int actual){
        assertEquals(expected, Task4.climb(actual));
    }
}
