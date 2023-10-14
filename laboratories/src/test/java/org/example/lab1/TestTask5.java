package org.example.lab1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestTask5 {
    @ParameterizedTest
    @DisplayName("Checking the exponentiation of a number.")
    @CsvSource(value = {"The result, The number for the ascension, Degree", "1024.0, 2.0, 10", "9.261, 2.1, 3", "0.25, 2.0, -2"}, useHeadersInDisplayName = true)
    void testReversString(double result, double num, int degree){
        assertEquals(result, Task5.pow(num, degree));
    }
}
