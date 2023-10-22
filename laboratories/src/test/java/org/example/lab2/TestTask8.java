package org.example.lab2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTask8 {
    @ParameterizedTest
    @DisplayName("Test a method that checks whether a given array is a mountain array.")
    @MethodSource("provideTestData")
    void testCheckMountainRange(int[] input, boolean output){
        var actual = Task8.checkMountainRange(input);
        assertEquals(output, actual);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new int[]{0, 1, 2, 3, 4, 2, 1}, true),
                Arguments.of(new int[]{0, 2, 3, 3, 5, 2, 1}, false),
                Arguments.of(new int[]{2, 1}, false),
                Arguments.of(new int[]{3, 5, 5}, false),
                Arguments.of(new int[]{0, 3, 2, 1}, true)
        );
    }
}
