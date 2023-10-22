package org.example.lab2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTask7 {
    @ParameterizedTest
    @DisplayName("Test a method that checks whether N and its dual exist.")
    @MethodSource("provideTestData")
    void testСheckNDuplicate(int[] input, boolean output){
        var actual = Task7.checkNDuplicate(input);
        assertEquals(output, actual);
    }

    private static Stream<Arguments> provideTestData(){
        return Stream.of(
                Arguments.of(new int[]{10,2,5,3}, true),
                Arguments.of(new int[]{3, 1, 7, 11}, false)
        );
    }
}
