package org.example.lab2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTask2 {
    @ParameterizedTest
    @DisplayName("Checking a function that returns the number of numbers that have an even number of digits in an array.")
    @MethodSource("provideTestData")
    void testContainEvenNumberOfDigits(int[] input, int output){
        var actual = Task2.containEvenNumberOfDigits(input);
        assertEquals(output, actual);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new int[]{12, 345, 2, 6, 7896}, 2),
                Arguments.of(new int[]{555, 901, 482, 1771}, 1)
        );
    }
}
