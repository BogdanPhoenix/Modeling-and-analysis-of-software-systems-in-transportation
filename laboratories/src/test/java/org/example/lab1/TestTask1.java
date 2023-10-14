package org.example.lab1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestTask1 {
    @ParameterizedTest
    @DisplayName("Checking string rotation in reverse order.")
    @CsvSource(value = {"A word in reverse, Original word", "regit, tiger", "'', ''", "did, did"}, useHeadersInDisplayName = true)
    void testReversString(String expected, String text){
        var actual = Task1.reversString(text);
        assertEquals(expected, actual);
    }
}
