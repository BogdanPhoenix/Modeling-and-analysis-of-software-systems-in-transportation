package org.example.lab2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TestTask1 {
    @ParameterizedTest
    @DisplayName("Checking the function to return the maximum number of repetitions of the 1st digit in an array.")
    @MethodSource("provideTestData")
    void testMaxNumRepetitionsFirst(int[] input, int output){
        var actual = Task1.maxNumRepetitionsFirst(input);
        assertEquals(output, actual);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new int[]{1,1,0,1,1,1}, 3),
                Arguments.of(new int[]{1,0,1,1,0,1}, 2)
        );
    }
}
