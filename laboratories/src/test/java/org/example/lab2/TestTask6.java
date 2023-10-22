package org.example.lab2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTask6 {
    @ParameterizedTest
    @DisplayName("Test a method that removes duplicates from a sorted array.")
    @MethodSource("provideTestData")
    void testRemoveDuplicates(int[] input, int output){
        var actual = Task6.removeDuplicates(input);
        assertEquals(output, actual);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2}, 2),
                Arguments.of(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 5),
                Arguments.of(new int[]{2}, 1)
        );
    }
}
